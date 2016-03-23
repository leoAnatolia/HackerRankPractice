package com.avivasa.collections;

import java.util.Scanner;

public class JavaTwoDArray {

	/*
	 * Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19


	 */
	public static void main(String[] args) {
		
		int maxHourGlassVal = -100000;
		int tempCalc = 0;

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        

        int[][]  tempArr;
        
        
        for (int m = 0; m < 4; m++) {
			for (int n = 0; n < 4; n++) {
				
		        tempArr = populateTempArray(arr,m,n);
		        tempCalc = calculateHourGlassVal(tempArr);
		        if(tempCalc > maxHourGlassVal) maxHourGlassVal = tempCalc;
				
				
			}
		}
        
        
        
        System.out.println(maxHourGlassVal);
        

	}

	private static int[][] populateTempArray(int[][] arr, int iPointer, int jPointer) {
		
		int[][]  temp = new int[3][3];
		
		for(int i=0; i < 3; i++){
        	for(int j=0; j < 3; j++){
                temp[i][j] = arr[i+iPointer][j+jPointer];
            }
        }
		
		return temp;
	}

	protected static int calculateHourGlassVal(int[][] subArray) {
		
		int val = subArray[0][0] + subArray[0][1] + subArray[0][2] + subArray[1][1] + subArray[2][0] + subArray[2][1] + subArray[2][2];
		
		
		return val;
	}
	

}
