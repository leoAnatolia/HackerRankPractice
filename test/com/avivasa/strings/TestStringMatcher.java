package com.avivasa.strings;
import com.avivasa.strings.StringMatcher;

import junit.framework.TestCase;


public class TestStringMatcher extends TestCase {
  private StringMatcher m;

  @Override
	protected void setUp() throws Exception {
	  m = new StringMatcher();
  }

  public void testIsTrue() {
    assertTrue(m.isTrue("true"));
    assertFalse(m.isTrue("true2"));
    assertFalse(m.isTrue("True"));
  }

  
  public void testIsTrueVersion2() {
    assertTrue(m.isTrueVersion2("true"));
    assertFalse(m.isTrueVersion2("true2"));
    assertTrue(m.isTrueVersion2("True"));;
  }

  
  public void testIsTrueOrYes() {
    assertTrue(m.isTrueOrYes("true"));
    assertTrue(m.isTrueOrYes("yes"));
    assertTrue(m.isTrueOrYes("Yes"));
    assertFalse(m.isTrueOrYes("no"));
  }

  
  public void testContainsTrue() {
    assertTrue(m.containsTrue("thetruewithin"));
  }

  
  public void testIsThreeLetters() {
    assertTrue(m.isThreeLetters("abc"));
    assertFalse(m.isThreeLetters("abcd"));
  }

  
  public void testisNoNumberAtBeginning() {
    assertTrue(m.isNoNumberAtBeginning("abc"));
    assertFalse(m.isNoNumberAtBeginning("1abcd"));
    assertTrue(m.isNoNumberAtBeginning("a1bcd"));
    assertTrue(m.isNoNumberAtBeginning("asdfdsf"));
  }

  
  public void testisIntersection() {
    assertTrue(m.isIntersection("1"));
    assertFalse(m.isIntersection("abcksdfkdskfsdfdsf"));
    assertTrue(m.isIntersection("skdskfjsmcnxmvjwque484242"));
  }

  
  public void testLessThenThreeHundred() {
    assertTrue(m.isLessThenThreeHundred("288"));
    assertFalse(m.isLessThenThreeHundred("3288"));
    assertFalse(m.isLessThenThreeHundred("328 8"));
    assertTrue(m.isLessThenThreeHundred("1"));
    assertTrue(m.isLessThenThreeHundred("99"));
    assertFalse(m.isLessThenThreeHundred("300"));
  }

} 
