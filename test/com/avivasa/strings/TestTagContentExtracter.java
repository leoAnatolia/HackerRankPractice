package com.avivasa.strings;

import com.avivasa.strings.TagContentExtracter;

import junit.framework.TestCase;

public class TestTagContentExtracter extends TestCase {
	
	/*
 * Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
 */
	 

	public TestTagContentExtracter(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
	public void testextractContent() throws Exception {
		
		
		String st1 = "<h1>Nayeem loves counseling</h1>";
		
		String st2 = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		
		String st3 = "<Amee>safat codes like a ninja</amee>";
		String st4 = "<SA premium>Imtiaz has a secret crush</SA premium>";
		
		String st5 = "<h1>had<h1>public</h1515></h1>";
		
		//String st6 = "<wkjkTvAuA8Zk}n_l7Si\\"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF</wkjkTvAuA8Zk}n_l7Si"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>";
		
		assertEquals("Nayeem loves counseling", TagContentExtracter.extractContent(st1));
		assertEquals("Sanjay has no watch"+"\n"+"So wait for a while", TagContentExtracter.extractContent(st2));
		assertEquals("None", TagContentExtracter.extractContent(st3));
		assertEquals("Imtiaz has a secret crush", TagContentExtracter.extractContent(st4));

		
		
		
		
	}
}
