package com.avivasa.collections;

import java.util.Scanner;

public class JavaOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int arrayLength = sc.nextInt();
		
		int[] inputArray = new int[arrayLength];
		
		
		
		for (int i = 0; i < inputArray.length; i++) {
			
			inputArray[i] = sc.nextInt();
		}
		
		
		System.out.println(negativeArrayCount(inputArray));}



	private static int negativeArrayCount(int[] inputArray) {
		
		int returnVal = 0;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i; j < inputArray.length; j++) {
			
				if(arrayAddition(i,j,inputArray) < 0){
					returnVal++;
				}
			}
			
			
			
		}
		
		return returnVal;
	}

	public static int arrayAddition(int i, int j, int[] inputArr) {

		int r = 0;
		
		for (int k = i; k <= j; k++) {
			r += inputArr[k];
		}
		
		
		return r;
	}    


}



