package com.avivasa.oop;

import com.avivasa.oop.Calculate;

import junit.framework.TestCase;

public class TestVolume extends TestCase {

	private Calculate calculate;

	protected void setUp() throws Exception {
		calculate = new Calculate("test");
	}

	
	public void testVolumeHemisphere() throws Exception {
		
		assertEquals(16.755, calculate.main(2.0));
	}
	
	
	public void testVolumeCylinder() throws Exception {
		assertEquals(628.319, calculate.main(5.0, 8.0));
		
		double dVal = 290.1;
		System.out.printf ("Value with 4 digits after decimal point %.3f", dVal);
		
		
	}
}
