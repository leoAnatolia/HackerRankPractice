package com.avivasa.codewhiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		/*
		 * 
Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
		 */

		List<Integer> L = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		while (N-- > 0){
			L.add(new Integer(scanner.nextInt()));
		}
		
		int M = scanner.nextInt();
		String queryType;
		int index;
		int listVal;
		while (M-- > 0){
			
			queryType = scanner.next();
			
			if(queryType.equals("Insert")){
				index = scanner.nextInt();
				listVal = scanner.nextInt();
				
				L.add(index,new Integer(listVal));
			}
			
			if(queryType.equals("Delete")){
				index = scanner.nextInt();
				
				L.remove(index);
			}

		}
		
		
		for (Integer temp:L) {
			System.out.print(temp+" ");
			
		}
	
	}

}
