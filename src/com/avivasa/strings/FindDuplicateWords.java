package com.avivasa.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateWords {

	public static void main(String[] args) {

		String inputStr = " ozgur ozgur ozgur ";
		Pattern pattern = Pattern.compile("\\b(\\w+)\\s+");
		
		Matcher matcher = pattern.matcher(inputStr);
		
		
		// check all occurance
	    while (matcher.find()) {
	      System.out.print("Start index: " + matcher.start());
	      System.out.print(" End index: " + matcher.end() + " ");
	      System.out.println(matcher.group(0));
	    }
		
	}

}
