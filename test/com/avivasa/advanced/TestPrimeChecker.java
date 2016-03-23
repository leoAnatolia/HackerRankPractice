package com.avivasa.advanced;

import junit.framework.TestCase;

public class TestPrimeChecker extends TestCase {
	
	Prime prime ;

	protected void setUp() throws Exception {
		prime = new Prime();
	}

	
	public void testIsPrime() throws Exception {
		assertFalse(prime.isPrime(0));
		assertFalse(prime.isPrime(1));
		assertFalse(prime.isPrime(10));
		assertFalse(prime.isPrime(9));
		
		assertTrue(prime.isPrime(3));
		assertTrue(prime.isPrime(5));
		assertTrue(prime.isPrime(7));
		assertTrue(prime.isPrime(17));
		
	}
}
