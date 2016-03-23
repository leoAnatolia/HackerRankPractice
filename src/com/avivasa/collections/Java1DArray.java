package com.avivasa.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class WalkingPath{
	int jumpUnit;
	String[] walkingArray;
	String walkingString;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("jumpUnit:"+jumpUnit+"[");
		
		for (int i = 0; i < walkingArray.length; i++) {
			sb.append(walkingArray[i]+" ");	
		}
		
		sb.append("]");
		
		
		return sb.toString();
	}
}
public class Java1DArray {

	public static void main(String[] args) {
		/*
		 * 
Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
		 * */
		List<WalkingPath> gameData = new ArrayList<WalkingPath>();
		Scanner scanner = new Scanner(System.in);

		int numOfinputLines = scanner.nextInt();
		
		scanner.nextLine();
		
		for (int i = 0; i < numOfinputLines; i++) {
			WalkingPath wp = new WalkingPath();
			int arrLen = scanner.nextInt();
			int jumpLen = scanner.nextInt();
			
			wp.walkingArray = new String[arrLen];
			wp.jumpUnit = jumpLen;
			
			scanner.nextLine();
			
			wp.walkingString = scanner.nextLine();
			
			wp.walkingArray = wp.walkingString.split("\\s");
			wp.walkingString = wp.walkingString.replaceAll("\\s+","");
			
			gameData.add(wp);
			
		}
		
		
		for (Iterator iterator = gameData.iterator(); iterator.hasNext();) {
			WalkingPath walkingPath = (WalkingPath) iterator.next();
			
			System.out.println(assessWalkingGame(walkingPath));
			
		}


	}

	private static String assessWalkingGame(WalkingPath walkingPath) {
		
		String regex = ".*[1-9]{"+walkingPath.jumpUnit+",}.*";

		
		
		if(walkingPath.jumpUnit > walkingPath.walkingArray.length)
			return "YES";
		
		if(walkingPath.walkingString.matches(regex))
			return "NO";
		
		
		return "YES";
	}
	
	

}
