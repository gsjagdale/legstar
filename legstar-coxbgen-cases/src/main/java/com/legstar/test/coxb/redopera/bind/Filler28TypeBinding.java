/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/

package com.legstar.test.coxb.redopera.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.CStringBinding;
import com.legstar.coxb.rt.CZonedDecimalBinding;
import java.math.BigDecimal;

import com.legstar.test.coxb.redopera.Filler28Type;
import com.legstar.test.coxb.redopera.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-01-26T18:17:46.265+01:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class Filler28TypeBinding 
             extends CComplexBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "filler28";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "Filler28Type";
    
    /** Child property CZonedDecimalBinding of simple type. */
    public CZonedDecimalBinding cInteger;
            
    /** Child property CStringBinding of simple type. */
    public CStringBinding filler30;
            
    /** Java object to which this cobol complex array element is bound. */
    private Filler28Type mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public Filler28TypeBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public Filler28TypeBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public Filler28TypeBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public Filler28TypeBinding(
        final ObjectFactory objectFactory,
        final Filler28Type jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public Filler28TypeBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final Filler28Type jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        /* Create binding children instances */
        cInteger = new CZonedDecimalBinding("cInteger", 8, 8, 0, true, false, false);
        cInteger.setCobolName("C-INTEGER");
        filler30 = new CStringBinding("filler30", 192, false);
        filler30.setCobolName("FILLER-30");
        
        /* Add children to children list */
           
        getChildrenList().add(cInteger);
        getChildrenList().add(filler30);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createFiller28Type());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getCInteger() != 0) {
            /* Set value from cInteger*/
            cInteger.setValue(new BigDecimal(mJaxbObject.getCInteger()));
        
        }
                
        if (mJaxbObject.getFiller30() != null) {
            /* Set value from filler30*/
            filler30.setValue(mJaxbObject.getFiller30());
        }
    
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueCInteger();
            break;
        case 1:
            setBoundObjectValueFiller30();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueCInteger() throws HostException {
    
        if (cInteger.getValue() != null) {
            
            /* Set value of cInteger*/
            mJaxbObject.setCInteger(cInteger.getValue().intValueExact());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueFiller30() throws HostException {
    
        if (filler30.getValue() != null) {
            /* Set value of filler30*/
            mJaxbObject.setFiller30(filler30.getValue());
        }
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final Filler28Type getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final Filler28Type jaxbObject) {
        mJaxbObject = jaxbObject;
    }

    /**
     * @return the java object factory for objects creation
     */
    public final ObjectFactory getObjectFactory() {
        return mObjectFactory;
    }

    /**
     * @param objectFactory the java object factory for objects creation to set
     */
    public final void setObjectFactory(final ObjectFactory objectFactory) {
        mObjectFactory = objectFactory;
    }

}
