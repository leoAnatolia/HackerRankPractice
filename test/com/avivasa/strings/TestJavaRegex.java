package com.avivasa.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;

public class TestJavaRegex extends TestCase {
	
	

	public TestJavaRegex(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testEitherorCheck() throws Exception {
		String s = "humbapumpa jim";
	    assertTrue(s.matches(".*(jim|joe).*"));
	    
	    
	    
	    s = "humbapumpa jom";
	    assertFalse(s.matches(".*(jim|joe).*"));
	    
	    
	    s = "humbaPumpa joe";
	    assertTrue(s.matches(".*(jim|joe).*"));
	    
	    s = "humbapumpa joe jim";
	    assertTrue(s.matches(".*(jim|joe).*"));
	}
	
	
	public void testPhoneNumber() throws Exception {
		
		
		
		
		String pattern = "\\d\\d\\d([\\s])?\\d\\d\\d\\d";
	    String s= "1233323322";
	    assertFalse(s.matches(pattern));
	    
	    
	    s = "1233323";
	    assertTrue(s.matches(pattern));
	    
	    
	    s = "123 3323";
	    assertTrue(s.matches(pattern));
	    
	    
	}
	
	
	public void testClearDuplicates() throws Exception {
		
		//String inputText = "Goodbye bye bye world world world";
		//String inputText = "Rana is is the the best player in eye eye game";
		
		/*
		 * tap taptap For fOr for forfor
taptap of kirethe the hte hTe hte
tim tamtim tam tam ta tam tam
a a a a a a a a a a a a a a a a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


5
tap taptap For fOr for forfor
taptap of kirethe the hte hTe hte
tim tamtim tam tam ta tam tam
a a a a a a a a a a a a a a a a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa


output
-----------
tap taptap For forfor
taptap of kirethe the hte
tim tamtim tam ta tam
a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
		 */
		
		String inputText ="tap taptap FOR For fOr for for for for FOR forfor";
		//String inputText = "taptap of kirethe the hte hTe hte";
		//String inputText = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		//String inputText = "a a a a a a a a a a a a a a a a";
		
	
		String wordRegex = "(\\b\\w+\\b)(\\s\\b\\1\\b)*";
		//String wordRegex = "\\b(\\w+\\s)\\b\\s+(\\b\\1\\b\\s)*";
		//String wordRegex = "\\b(\\w+)\\b\\s+(\\b(\\1)+\\b)*";
		//String wordRegex = "(\\b(\\w+)\\b){2,}";
		Pattern pattern = Pattern.compile(wordRegex,Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(inputText);
		
		while(matcher.find()){
			//System.out.println("matcher0:"+matcher.group(0));
			//System.out.println("matcher1:"+matcher.group(1));
			inputText = inputText.replaceAll(matcher.group(),matcher.group(1));
			
			//matcher = pattern.matcher(inputText);
		}
		
		System.out.println(inputText);
		
	}
	
	
	public void testIsValidIP() throws Exception {
		/*
		 * Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56


Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
		 */
		
		/*
		 * // returns true if the string contains a number less then 300
  public boolean isLessThenThreeHundred(String s){
    return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
  }
		 */
		//String subPattern = "[012]?[012345]?[012345]?";
		String subPattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
		String patternStr = subPattern+"[.]"
						  + subPattern+"[.]"
						  + subPattern+"[.]"
						  + subPattern;
		
		
		
		Pattern pattern = Pattern.compile(patternStr);
		
		
		String inputStr1 = "100.12.12.034",inputStr2="121.234.12.12",inputStr3="23.45.12.56";
		
		assertTrue(inputStr1.matches(patternStr));
		assertTrue(inputStr2.matches(patternStr));
		assertTrue(inputStr3.matches(patternStr));
		
		String inputStr4 = "000.12.234.23.23",inputStr5="666.666.23.23";//,inputStr2="121.234.12.12",inputStr3="23.45.12.56";
		assertFalse(inputStr4.matches(patternStr));
		assertFalse(inputStr5.matches(patternStr));
		
		
		
	}


	public void testUsernameChecker() throws Exception {
		
		/*
		 * Sample Input

4
alpha_naheed
xahidbuffon
nagib@007
123Swakkhar
Sample Output

Valid
Valid
Invalid
Invalid
		 */
		
		String pattern = "[a-zA-Z]\\w{7,29}";
		
		String st1 = "abcdefghxxxxxxxxxxxxxxABCxxxxx", st2="alpha_naheed",st3="xahidbuffon";
		
		assertTrue(st1.matches(pattern));
		assertTrue(st2.matches(pattern));
		assertTrue(st3.matches(pattern));
		
		String st4 = "nagib@007", st5="123Swakkhar";
		
		assertFalse(st4.matches(pattern));
		assertFalse(st5.matches(pattern));
		
	}

	
	public void testRecurringOnes() throws Exception {
		int jumpUnit = 3;
		String regex = ".*[1-9]{"+jumpUnit+",}.*";
		
		String testSTR = "00001110000";
		
		assertTrue(testSTR.matches(regex));
		
		String concatStr ="0 0 1 1 1";
		
		assertEquals("00111", concatStr.replaceAll("\\s+",""));
		
	}

}
