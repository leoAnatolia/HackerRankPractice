package com.avivasa.codewhiz;

import java.util.Scanner;

public class MaxMin {
	
	
	public static void print(int A[],int i){
        try{
              System.out.println(A[i]);
          }
        
        finally{
        	
        	int min = 1000, max = -1000;
        	
        	
        	for (int j = 0; j < A.length; j++) {
				
        		if(A[j] < min){
        			min = A[j];
        		}
        		if(A[j] > max){
        			max = A[j];
        		}
			}
        	
        	System.out.println(max+" "+min);
        	
        }
        	
	}

	
	public static void main(String[] args) {
        int N;
        Scanner st=new Scanner(System.in);
        N=st.nextInt();
        
        int A[]=new int[N];
        
        for(int i=0;i<N;i++)
        {
           A[i]=st.nextInt();
        }
        
        
        int i=st.nextInt();
        
        try
        {
            print(A,i);

        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
        
   }// end of main
}// end of Solution
	

