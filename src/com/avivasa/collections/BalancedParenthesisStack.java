package com.avivasa.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BalancedParenthesisStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			System.out.println(isBalanced(input));

		}

	}

	public static boolean isBalanced(String input) {

		Deque<Integer> stack = new ArrayDeque<Integer>();

		char[] parenthesisArray = input.toCharArray();

		for (int i = 0; i < parenthesisArray.length; i++) {

			if (parenthesisArray[i] == '(' || parenthesisArray[i] == '{'
					|| parenthesisArray[i] == '[') {

				stack.addFirst((int) parenthesisArray[i]);
			}

			else if (parenthesisArray[i] == ')') {

				if (stack.isEmpty())
					return false;

				else if (stack.peek().intValue() == '(') {
					stack.removeFirst();
				}
			}

			else if (parenthesisArray[i] == ']') {
				
				if (stack.isEmpty())
					return false;

				else if (stack.peek().intValue() == '[') {
					stack.removeFirst();
				}
			} 
			
			else if (parenthesisArray[i] == '}')
			{
				
				if (stack.isEmpty())
					return false;

				else if (stack.peek().intValue() == '{') {
					stack.removeFirst();
				}
			}
		}

		if (stack.isEmpty())
			return true;

		return false;

	}

}
