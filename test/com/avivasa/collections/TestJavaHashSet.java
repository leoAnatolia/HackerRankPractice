package com.avivasa.collections;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;




import org.junit.Test;

import com.avivasa.collections.Pair;

import junit.framework.TestCase;

public class TestJavaHashSet extends TestCase {

	public TestJavaHashSet(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	@Test
	public void testPairEquals() throws Exception {
		
		Pair p1 = new Pair();
		p1.firstStr = "ozgur";
		p1.secondStr = "k";
		
		
		Pair p2 = new Pair();
		p2.firstStr = "ozgur";
		p2.secondStr = "k";
		
		assertTrue(p1.equals(p2));
		
		Set<Pair> testSet = new HashSet<Pair>();
		
		testSet.add(p1);
		
		assertTrue(testSet.contains(p2));
		
		
	}

}
