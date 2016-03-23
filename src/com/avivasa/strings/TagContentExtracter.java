package com.avivasa.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtracter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		String tempStr;
		
		while (testCases > 0) {
			String line = in.nextLine();

			tempStr = extractContent(line);
			
			while(tempStr.length() > 4 && tempStr.contains("<")){
				tempStr = extractContent(tempStr);
			}
				
				System.out.println(tempStr);

			
			

			testCases--;
		}
	}

	/*
	 * /* Sample Input
	 * 
	 * 4 <h1>Nayeem loves counseling</h1> <h1><h1>Sanjay has no
	 * watch</h1></h1><par>So wait for a while</par> <Amee>safat codes like a
	 * ninja</amee> <SA premium>Imtiaz has a secret crush</SA premium> Sample
	 * Output
	 * 
	 * Nayeem loves counseling Sanjay has no watch So wait for a while None
	 * Imtiaz has a secret crush
	 */

	public static String extractContent(String line) {

		String returnStr = "";
		String regex = "(<(.+?)>)(.+)(<[/]\\2>)";

		StringBuffer sb = new StringBuffer();

		Pattern pattern = Pattern.compile(regex);

		Matcher m = pattern.matcher(line);

		boolean isPatternMatched = m.find();

		if (isPatternMatched) {
			
			
			while (isPatternMatched) {
				sb.append(m.group(3) + "\n");

				isPatternMatched = m.find();
			}
			
			returnStr = sb.toString().substring(0, sb.toString().length() - 1);
			
		} else {
			returnStr = "None";
		}
		
		
		return returnStr;
	}

}
