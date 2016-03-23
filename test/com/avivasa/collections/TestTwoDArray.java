package com.avivasa.collections;

import com.avivasa.collections.JavaTwoDArray;

import junit.framework.TestCase;

public class TestTwoDArray extends TestCase {

	JavaTwoDArray javaTwoDArray;
	public TestTwoDArray(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		 javaTwoDArray = new JavaTwoDArray();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testCalculateHourGlass() throws Exception {
		/*
		 * 1 2 4
		 * 0 3 1
		 * 0 0 0
		 * 
		 */
		
		int[][] hgArr = new int[][]{{1,2,4},{0,3,1},{0,0,0}};
		int[][] hgArr1 = new int[][]{{1,1,1},{0,0,0},{0,0,0}};
		
		assertEquals(10, JavaTwoDArray.calculateHourGlassVal(hgArr));
		assertEquals(3, JavaTwoDArray.calculateHourGlassVal(hgArr1));
 		
	}
	

}
