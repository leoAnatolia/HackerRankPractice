package com.avivasa.advanced;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;;

class Prime{
	
	
	public void checkPrime(int...numbers ){
		
		
		for (int num:numbers) {
			if(isPrime(num)){
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}
	
	
	protected boolean isPrime(int num){
		int temp;
		boolean isPrime=true;
		
		if(num < 2) return false;
		
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		return isPrime;
	}
}

public class PrimeChecker {


		

		public static void main(String[] args) {
			try{
				/*
  input
  
  2 n1
  1 n2
  3 n3
  4 n4
  5 n5
  
output
2 
2 
2 3 
2 3 5
				 */
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			
			
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			
			
			
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<String>();
			boolean overload=false;
			
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}


