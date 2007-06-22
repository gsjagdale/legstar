/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
package com.legstar.coxb.impl;

import com.legstar.binding.CobolElement;
import com.legstar.coxb.CobolElementVisitor;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.host.HostException;

/**
 * This class implements the behavior of a string cobol element bound to
 * a JAXB String property.
 *
 * @author Fady Moussallam
 * 
*/
public class CStringBinding
	extends CBinding
	implements ICobolStringBinding {
	
	/** The current value for this element. */
	private String mValue = null;
	
	/**
	 * Creates an empty binding between a Cobol element and a java String.
	 * 
	 * @param javaName the name of the bound java property
	 * @param javaType the type of the bound java property
	 */
	public CStringBinding(
			final String javaName,
			final Class javaType) {
		
		super(javaName, javaType);
	}
	
	/**
	 * Creates a binding between a Cobol element and a java String.
	 * 
	 * @param javaName the name of the bound java property
	 * @param javaType the type of the bound java property
	 * @param cobolAnnotations the cobol annotations for this element
	 */
	public CStringBinding(
			final String javaName,
			final Class javaType,
			final CobolElement cobolAnnotations) {
		
		super(javaName, javaType, cobolAnnotations);
	}
	
	/** {@inheritDoc} */
	public final void accept(final CobolElementVisitor cev)
		throws HostException {
		cev.visit(this);
	}
	
	/** {@inheritDoc} */
	public final String getStringValue() throws HostException {
		return mValue;
	}

	/** {@inheritDoc} */
	public final void setStringValue(final String value) throws HostException {
		mValue = value;
	}

	/** {@inheritDoc} */
	public final int calcByteLength() throws HostException {
		return getByteLength();
	}

	/** {@inheritDoc} */
	public final Object getObjectValue(final Class type) throws HostException {
		if (type.equals(String.class)) {
			return mValue;
		} else {
			throw new HostException("Attempt to get binding " + getJavaName()
					+ " as an incompatible type " + type);
		}
	}

	/** {@inheritDoc} */
	public final void setObjectValue(final Object value) throws HostException {
		if (value == null) {
			mValue = null;
			return;
		}
		if (value instanceof String) {
			 mValue = (String) value;
		} else {
			throw new HostException("Attempt to set binding " + getJavaName()
					+ " from an incompatible value " + value);
		}
	}

	/** {@inheritDoc} */
	public final boolean isSet() {
		return (mValue != null);
	}
}
