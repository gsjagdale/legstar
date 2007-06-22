package com.legstar.test.coxb;

import com.legstar.test.coxb.redopera.DfhcommareaType;

import junit.framework.TestCase;

public class MarshalRedoperaTest extends TestCase {

	private final static String SCHEMA_NAME = "redopera";
	
	public void testRedoperaStringMethod() throws Exception {

		// Create and populate an instance of an object (JAXB annotated)
		DfhcommareaType dfhcommareaType = (DfhcommareaType) Util.getJaxbObject(SCHEMA_NAME);

		dfhcommareaType.setCFunction("stringMethod");
		dfhcommareaType.setCData("");

		assertEquals("a2a399899587d485a38896844040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040",
				Util.marshal(SCHEMA_NAME, dfhcommareaType, 218));
	}

	public void testRedoperaIntMethod() throws Exception {

		// Create and populate an instance of an object (JAXB annotated)
		DfhcommareaType dfhcommareaType = (DfhcommareaType) Util.getJaxbObject(SCHEMA_NAME);
		
		dfhcommareaType.setCFunction("intMethod");
		dfhcommareaType.setCData("");

		assertEquals("8995a3d485a38896844040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040404040",
				Util.marshal(SCHEMA_NAME, dfhcommareaType, 218));
	}
}
