package com.avivasa.collections;

import com.avivasa.collections.BalancedParenthesisStack;

import junit.framework.TestCase;

public class TestBalancedParenthesis extends TestCase {

	private BalancedParenthesisStack balancedParenthesisStack;


	protected void setUp() throws Exception {
		balancedParenthesisStack = new BalancedParenthesisStack();
	}
	
	/*
	 * {}()
({()})
{}(
[]
	 */
	public void testIsBalanced() throws Exception {
		assertFalse(balancedParenthesisStack.isBalanced("((}{}}"));
		assertTrue(balancedParenthesisStack.isBalanced("{}()"));
		assertFalse(balancedParenthesisStack.isBalanced("{}("));
		assertTrue(balancedParenthesisStack.isBalanced("[]"));
		assertTrue(balancedParenthesisStack.isBalanced("({()})"));
		
		/*
		 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
		 */
		
		assertTrue(balancedParenthesisStack.isBalanced("{}()"));
		assertTrue(balancedParenthesisStack.isBalanced("[{()}]"));
		assertTrue(balancedParenthesisStack.isBalanced("({()})"));
		
		assertFalse(balancedParenthesisStack.isBalanced("{}("));
		assertFalse(balancedParenthesisStack.isBalanced("({)}"));
		assertFalse(balancedParenthesisStack.isBalanced("[["));
		assertFalse(balancedParenthesisStack.isBalanced("}{"));
	}

}
