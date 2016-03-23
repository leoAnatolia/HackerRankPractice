package com.avivasa.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Pair implements Comparator<Pair>{
	public String firstStr;
	public String secondStr;
	@Override
	public int compare(Pair o1, Pair o2) {
		int returnVal = -1;

		if(o1.firstStr.equals(o2.firstStr) && o1.secondStr.equals(o2.secondStr)) returnVal = 0;
		
		
		return returnVal;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pair o2 = null;
		if(obj instanceof Pair){
			o2 = (Pair)obj;
		}
		return(this.firstStr.equals(o2.firstStr) && this.secondStr.equals(o2.secondStr));
		
	}
	
	
	@Override
	public int hashCode() {


		return firstStr.hashCode() * secondStr.hashCode();
		
	}
	
}

public class JavaHashset {

	public static void main(String[] args) {
		/*
		 * Sample Input
	
				5
				john tom
				john mary
				john tom
				mary anna
				mary anna
			Sample Output
			
			1
			2
			2
			3
			3
		 */

		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.nextLine();
		
		Set<Pair> pairSet = new HashSet<Pair>();
		String line;
		StringBuffer outputBuffer = new StringBuffer();
		
		while(N>0){
			line = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			
			Pair p = new Pair();
			p.firstStr = st.nextToken().trim();
			p.secondStr = st.nextToken().trim();
			
			if(!pairSet.contains(p)){
				pairSet.add(p);
			}
			
			outputBuffer.append(pairSet.size()+"\n");
			
			
			N--;
		}
		
		
		
		System.out.println(outputBuffer.toString());
		
	}

}
