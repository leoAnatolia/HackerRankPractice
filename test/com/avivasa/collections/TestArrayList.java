package com.avivasa.collections;

import com.avivasa.collections.JavaArrayList;
import com.avivasa.collections.LineData;

import junit.framework.TestCase;

public class TestArrayList extends TestCase {
	
	JavaArrayList javaArrayList;

	public TestArrayList(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		javaArrayList = new JavaArrayList();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConvertLineData() throws Exception {
		
		String inputStr = "5 41 77 74 22 44";
		
		LineData lineData = javaArrayList.convertLineData(inputStr,1);
		assertEquals(1, lineData.lineIndex);
		assertEquals(41, lineData.lineNumbers.get(1).intValue());
		assertEquals(77, lineData.lineNumbers.get(2).intValue());
		assertEquals(74, lineData.lineNumbers.get(3).intValue());
		assertEquals(22, lineData.lineNumbers.get(4).intValue());
		assertEquals(44, lineData.lineNumbers.get(5).intValue());
		
		
		
	}
}
