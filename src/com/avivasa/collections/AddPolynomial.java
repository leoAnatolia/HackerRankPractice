package com.avivasa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



class Term implements Comparable<Term>{
	
	int coefficient;
	int exponent;

	public Term(int coeff,int exp){
		this.coefficient = coeff;
		this.exponent = exp;
	}
	
	
	@Override
	public int compareTo(Term o) {
		int returnVal = o.exponent - this.exponent;
		
		if(returnVal == 0) returnVal = o.coefficient - this.coefficient; 
		
		return returnVal;
	}
	
	@Override
	public String toString() {
	
		return coefficient+" "+exponent;
	}
	
	public boolean isSameDegree(Term t){
		return this.exponent == t.exponent;
	}
}

public class AddPolynomial {
	
static{
		
		System.out.println("hello from static block");
	}

	public static void main(String[] args) {


		List<Term> pol1,pol2;

		printUsageInformation();
		
		
		Scanner scanner = new Scanner(System.in);
		
		String line1 = scanner.nextLine();
		pol1 = populatePolynomial(line1);
		
		
		String line2 = scanner.nextLine();
		pol2 = populatePolynomial(line2);
		

		List<Term> addedPolynom = new ArrayList<Term>();
		
		addedPolynom.addAll(pol1);
		addedPolynom.addAll(pol2);
		
		
		for (int i = 0; i < pol1.size(); i++) {
			Term term1 = pol1.get(i);
			
			for (int j = 0; j < pol2.size(); j++) {
				Term term2 =  pol2.get(j);
				
				if(term1.isSameDegree(term2)){
					addedPolynom.add(new Term(term1.coefficient+term2.coefficient,term1.exponent));
					addedPolynom.remove(term1);
					addedPolynom.remove(term2);
				}
			}

			
		}
		
		
		
		Collections.sort(addedPolynom);
		
		printPolynomialContent(addedPolynom);
		
		
	}

	private static void printUsageInformation() {
		System.out.println("Please enter two polynomial parameters one by one at each line");
		System.out.println("Enter value \"0\" for constant int value");
		
		System.out.println("E.g. for addition of polynomial 3x^4 + 2x^2 + 3x + 7  to 2x^3 + 4x + 5 enter the below parameters\n3 4 2 2 3 1 7 0\n2 3 4 1 5 0");
	}

	private static void printPolynomialContent(List<Term> polynomial) {
		for (Iterator iterator = polynomial.iterator(); iterator.hasNext();) {
			Term term = (Term) iterator.next();
			System.out.print(term+" ");
		}
		System.out.println();

	}

	private static List populatePolynomial(String line1) {
		List<Term> polynomialList = new ArrayList<Term>();
		
		String[] pol1Arr = line1.split("\\s");
		
		for (int i = 0; i < pol1Arr.length-1; i=i+2) {
			
			Term t = new Term(Integer.parseInt(pol1Arr[i]),Integer.parseInt(pol1Arr[i+1]));
			polynomialList.add(t);
			
		}
		return polynomialList;
	}

}
