package com.avivasa.collections;

import java.util.ArrayDeque;
import java.util.Deque;

import com.avivasa.collections.JavaDeque;

import junit.framework.TestCase;

public class TestJavaDeque extends TestCase {

	JavaDeque javaDeque;
	
	protected void setUp() throws Exception {
		javaDeque = new JavaDeque();
	}

	
	public void testGetUniqueCounter() throws Exception {
		
		Deque input = new ArrayDeque<Integer>();
		input.addFirst(1);
		input.addFirst(1);
		input.addFirst(2);
		input.addFirst(3);
		input.addFirst(4);
		input.addFirst(5);
		
		
		assertEquals(5, javaDeque.getUniqueCount(input));
		input.addFirst(5);
		input.addFirst(5);
		
		assertEquals(5, javaDeque.getUniqueCount(input));
		
		input.addFirst(6);
		
		assertEquals(6, javaDeque.getUniqueCount(input));
		
		
	}
}
