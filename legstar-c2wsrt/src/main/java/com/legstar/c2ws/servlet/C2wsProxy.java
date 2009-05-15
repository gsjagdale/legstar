/*******************************************************************************
 * Copyright (c) 2009 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.c2ws.servlet;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.proxy.invoke.ProxyConfigurationException;
import com.legstar.proxy.invoke.ProxyInvokerException;
import com.legstar.proxy.invoke.ServiceProxy;

/**
 * This proxy servlet receives HTTP requests and hand over control to
 * {@link com.legstar.proxy.invoke.ServiceProxy} which performs the
 * actual call to a remote process.
 * <p/>
 * The web.xml configuration file must provide all the necessary parameters
 * for ServiceProxy to perform its task.
 * <p/>
 * The servlet does not have any knowledge of the binding types or target
 * service. It is only concerned with HTTP transport to/from a mainframe.
 *
 */
public class C2wsProxy extends javax.servlet.http.HttpServlet {

    /** The serial ID. */
    static final long serialVersionUID = 1L;

    /** The old content-type supported by this class. */
    private static final String BINARY_CONTENT_TYPE = "binary/octet-stream";

    /** This content type is more easily understood by regular web servers.
     * Starting from now it will be the preferred content type. Even if we 
     * continue to support binary/octet-stream. */
    private static final String APPLICATION_CONTENT_TYPE = "application/octet-stream";

    /** The special http header for correlation ids. */
    private static final String CORRELATION_ID_HDR = "Correlation-id";

    /** Flood prevention for large data.   */
    private static final int MAX_TRACES_BYTES  = 500;
    
    /** Used to store configuration parameters in the application scope.*/
    private static final String PROXY_CONFIG_KEY = "com.legstar.c2ws.servlet.ProxyConfig";
    
    /** A service proxy key to store a proxy to service a session.*/
    private static final String SERVICE_PROXY_KEY = "com.legstar.c2ws.servlet.ServiceProxy";

    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());

    /** {@inheritDoc} */
    @SuppressWarnings("unchecked")
    public final void init(
            final ServletConfig config) throws ServletException {
        super.init(config);

        if (_log.isDebugEnabled()) {
            _log.debug("Initializing ");
        }
        Map < String, String > proxyConfig = new HashMap < String, String >();
        Enumeration < String > en = getServletConfig().getInitParameterNames();
        while (en.hasMoreElements()) {
            setInitParameter(proxyConfig, en.nextElement(), null);
        }
        setProxyConfig(proxyConfig);
    }

    /** {@inheritDoc} */
    protected void doPost(
            final HttpServletRequest request,
            final HttpServletResponse response) throws ServletException {

        long startTime = System.currentTimeMillis();

        /* Use correlation id received in http header. This allows logs on
         * this side to be easily correlated with the mainframe logs. */
        String requestID = request.getHeader(CORRELATION_ID_HDR);
        if (_log.isDebugEnabled()) {
            _log.debug("Start proxy request " + requestID 
                    + " from client " + request.getRemoteHost());
        }

        /* Make sure this is a Mainframe LegStar request. */
        if (!isSupportedContentType(request)) {
            throw new ServletException("Content type "
                    + request.getContentType()
                    + " is not supported");
        }

        try {
            /* Get all the bytes from the request in a byte array */
            int requestBytesLen = request.getContentLength();     
            byte[] requestBytes = new byte[requestBytesLen]; 
            InputStream in = request.getInputStream();
            int offset = 0;
            int n;
            do {
                n = in.read(requestBytes, offset, requestBytesLen - offset);
            } while (n != -1);
            
            if (_log.isDebugEnabled()) {
                _log.debug("Request data from host:");
                traceData(requestID, requestBytes, _log);
            }

            /* Call the proxy getting a byte array back */
            byte[] replyBytes = getServiceProxy(request).invoke(
                    getProxyConfig(), requestID, requestBytes);
            
            if (_log.isDebugEnabled()) {
                _log.debug("Reply data to host:");
                traceData(requestID, replyBytes, _log);
            }

            /* Push the reply byte array into the http response */
            response.setContentType(request.getContentType());
            response.getOutputStream().write(replyBytes);
            
        } catch (IOException e) {
            throw (new ServletException(e));
        } catch (ProxyInvokerException e) {
            throw (new ServletException(e));
        }

        long endTime = System.currentTimeMillis();
        if (_log.isDebugEnabled()) {
            _log.debug("End proxy request " + requestID 
                    + " from client " + request.getRemoteHost()
                    + " serviced in " + (endTime - startTime) + " msecs");
        }
    } 

    /**
     * Check that the client is sending a content type that we understand.
     * @param request the http request
     * @return true if the request has supported encoding
     */
    private boolean isSupportedContentType(final HttpServletRequest request) {
        if (request.getContentType().trim().compareToIgnoreCase(
                BINARY_CONTENT_TYPE) == 0
                || request.getContentType().trim().compareToIgnoreCase(
                        APPLICATION_CONTENT_TYPE) == 0) {
            return true;
        }
        return false;
    }

    /**
     * Locate an initialization parameter from the servlet configuration.
     * If the parameter is not found, a default value is used. The parameter
     * is then copied over to the in memory configuration.
     * @param proxyConfig the proxy configuration
     * @param parameterName the parameter name
     * @param defaultValue the default value if not found
     */
    private void setInitParameter(
            final Map < String, String > proxyConfig,
            final String parameterName,
            final String defaultValue) {
        String value = getServletConfig().getInitParameter(parameterName);
        if (value == null || value.length() == 0) {
            value = defaultValue;
            if (_log.isDebugEnabled()) {
                _log.debug("Parameter " + parameterName + " not found."
                        + " Using default value: " + value);
            }
        } else {
            if (_log.isDebugEnabled()) {
                _log.debug("Parameter " + parameterName + " found."
                        + " Using value: " + value);
            }
        }
        proxyConfig.put(parameterName.replace("c2ws.", ""), value);
    }

    /**
     * @return the application scope set of configuration parameters
     */
    @SuppressWarnings("unchecked")
    public Map < String, String > getProxyConfig() {
        return (Map < String, String >) getServletContext().getAttribute(PROXY_CONFIG_KEY);
    }
    
    /**
     * @param proxyConfig the application scope set of configuration parameters to set
     */
    public void setProxyConfig(final Map < String, String > proxyConfig) {
        getServletContext().setAttribute(PROXY_CONFIG_KEY, proxyConfig);
    }

    /**
     * This makes an attempt at cashing the service proxy in the servlet session.
     * just create a new proxy if cannot be retrieved from cache.
     * @param request the current http request
     * @return the proxy service which will invoke the remote process
     * @throws ServletException if a service proxy cannot be retrieved or created
     */
    public ServiceProxy getServiceProxy(final HttpServletRequest request) throws ServletException {
        ServiceProxy serviceProxy = null;
        HttpSession session = request.getSession(true);
        if (session != null) {
            serviceProxy = (ServiceProxy) session.getAttribute(SERVICE_PROXY_KEY);
            if (serviceProxy != null) {
                return serviceProxy;
            }
        }
        try {
            serviceProxy = new ServiceProxy(getProxyConfig());
            if (session != null) {
                session.setAttribute(SERVICE_PROXY_KEY, serviceProxy);
            }
            return serviceProxy;
        } catch (ProxyConfigurationException e) {
            throw new ServletException(e);
        }
    }

    /**
     * Produce a dump-like report of a data buffer content.
     * @param requestID a correlation id
     * @param data the raw data to trace
     * @param log where to log
     */
    public static void traceData(
            final String requestID,
            final byte[] data,
            final Log log) {

        StringBuilder dumpLine = new StringBuilder(); // 128
        String dumpChar; //[5];
        StringBuilder dumpString =  new StringBuilder(); //[17];

        for (int i = 0; i < data.length && i < MAX_TRACES_BYTES; i++) {
            /* print every 16 byte on a different line */
            dumpChar = String.format("%02X ", data[i] & 0xff);
            dumpLine.append(dumpChar);
            if (Character.isValidCodePoint(data[i])) {
                dumpChar = String.format("%c", data[i]);
            } else {
                dumpChar = "?";
            }
            if (dumpChar.length() > 0) {
                dumpString.append(dumpChar);
            } else {
                dumpString.append(" ");
            }
            if (i % 16 == 15 || i == data.length - 1) {
                while (i % 16 < 15) {
                    dumpLine.append("   ");
                    i++;
                }
                dumpLine.append(" -- ");
                dumpLine.append(dumpString);
                log.debug(dumpLine);
                dumpString =  new StringBuilder();
                dumpLine = new StringBuilder();
            }
        }

        if (data.length > MAX_TRACES_BYTES) {
            dumpLine.append(String.format("...data was truncated at %d bytes",
                    MAX_TRACES_BYTES));
            log.debug(dumpLine);
        }
    }
}
