package com.avivasa.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JavaDeque {
    // TODO  
    /*  1. m defa queue ya insert ederiz.
     *  2. Her insert işleminde queue içerisine bakıp mevcut değilse uniqueCounter ı artırırız.
     *  3. m defa insertion bitince, queue dan bir tane boşaltıp aynı işlemi tekrar yaparız.
     *  	uniqueCounter biryerlere karşılaştırmak üzere kaydederiz.
     *  4. Bu işlem (n-m+1) defa tekrarlanır. 
     * 
     * 
     */
	
	/*
	 * Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
	 */

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        Deque deque = new ArrayDeque<Integer>();
        int n = scanner.nextInt();  // total number of integers
        int m = scanner.nextInt();  // size of sub-array
        
        int[]  uniqueCounters = new int[n-m+1];
        
        long startTime = System.nanoTime();
	
        initializeCounters(uniqueCounters);

        long elapsedTime = System.nanoTime() - startTime;
        
        System.out.println("Total execution time to initialize counters in Java in millis: "
                + elapsedTime/1000000);
        

        
        for (int i = 0; i < m; i++) {
			deque.addFirst(scanner.nextInt());
		}

        uniqueCounters[0] = getUniqueCount(deque);
        
        startTime = System.nanoTime();
        
        for (int i = 1; i < n-m+1; i++) {
            deque.add(scanner.nextInt());
            deque.remove();

            uniqueCounters[i] = getUniqueCount(deque);
		}
        
        elapsedTime = System.nanoTime() - startTime;
        
        System.out.println("Total execution time to initialize counters in Java in millis: "
                + elapsedTime/1000000);
        
        
        calculateAndPrintMaxUniqueCounter(uniqueCounters);
	
	}


	private static void initializeCounters(int[] uniqueCounters) {
		for (int i = 0; i < uniqueCounters.length; i++) {
        	uniqueCounters[i] = 1;
		}
	}

	private static void calculateAndPrintMaxUniqueCounter(int[] uniqueCounters) {
		int maxUniqueVal = 0;
        
        
        for (int i = 0; i < uniqueCounters.length; i++) {
			
        	if(uniqueCounters[i] > maxUniqueVal) {
        		maxUniqueVal = uniqueCounters[i]; 
        	}
		}
        
        System.out.println(maxUniqueVal);
	}

	public static int getUniqueCount_old(Deque deque) {
		int returnVal = 0;

		List<Integer>	tempList = new ArrayList<Integer>();
		
		for (Iterator iterator = deque.iterator(); iterator.hasNext();) {
			Integer element = (Integer) iterator.next();
			
			tempList.add(element);
			
		}
		
		while(!tempList.isEmpty()){
			int e = (Integer) tempList.remove(0);
			
			if(!tempList.contains(e)) returnVal++;
		}
		

		return returnVal;
	}
	

	public static int getUniqueCount(Deque deque) {

		Set<Integer> set = new HashSet<Integer>();
	    set.addAll(deque);

	    return set.size();
	
	}

}
