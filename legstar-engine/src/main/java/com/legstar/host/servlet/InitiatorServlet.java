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
package com.legstar.host.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.configuration.CombinedConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.DefaultConfigurationBuilder;
import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.tree.xpath.XPathExpressionEngine;
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory; 

import com.legstar.host.server.EngineHandler;
import com.legstar.host.server.EngineStartupException;

/**
 * This Servlet is meant to run once, at startup type, and is in charge of
 * getting configuration data and hand over control to a handler.
 */
public class InitiatorServlet extends HttpServlet {

    /** Serial ID. */
    private static final long serialVersionUID = -4200681992731561770L;

    /** Config file name init param key. */
    public static final String CONFIG_PARAM = "engine.config";

    /** Identifier for the adapter instance in the servlet context. */ 
    public static final String ENGINE_HANDLER_ID =
        "com.legstar.c2ws.servlet.engineHandler";

    /** Logger. */
    private final Log _log = LogFactory.getLog(InitiatorServlet.class);

    /**
     * Servlet constructor.
     */
    public InitiatorServlet() {
        super();
    }

    /**
     * Initialization of the servlet. Loads configuration file and creates an
     * instance of the engine handler.
     *
     * @param config the complete configuration hierarchy
     * @throws ServletException if an error occurs
     */
    public final void init(
            final ServletConfig config) throws ServletException {
        String configFileName = config.getInitParameter(CONFIG_PARAM);
        if (configFileName == null || configFileName.length() == 0) {
            throw new ServletException(
                    "Web.xml does not contain the " + CONFIG_PARAM
                    + " parameter.");
        }

        _log.info("Initializing with " + configFileName
                + " configuration file.");

        try {
            EngineHandler serverHandler = new EngineHandler(
                    loadConfigFile(configFileName));
            serverHandler.init();
            ServletContext servletContext = config.getServletContext();
            servletContext.setAttribute(ENGINE_HANDLER_ID, serverHandler);
            
        } catch (ConfigurationException e) {
            _log.error("Failed to initialize.", e);
            throw new ServletException(e);
        } catch (EngineStartupException e) {
            _log.error("Failed to start engine.", e);
            throw new ServletException(e);
        }
    }

    /**
     * Use the Apache configuration API to retrieve the configuration file.
     * This gives q lot of flexibility to locate the file.
     * 
     * @param configFileName name of the configuration file
     * @return the configuration retrieved
     * @throws ConfigurationException if configuration cannot be retrieved
     */
    private HierarchicalConfiguration loadConfigFile(
            final String configFileName) throws ConfigurationException {
        _log.debug("Attempting to load " + configFileName);
        DefaultConfigurationBuilder dcb = new DefaultConfigurationBuilder();
        dcb.setFileName(configFileName);
        CombinedConfiguration config = (CombinedConfiguration)
        dcb.getConfiguration(true).getConfiguration(
                DefaultConfigurationBuilder.ADDITIONAL_NAME);
        config.setExpressionEngine(new XPathExpressionEngine());
        _log.debug("Load success for " + configFileName);
        return config; 
    }

}
