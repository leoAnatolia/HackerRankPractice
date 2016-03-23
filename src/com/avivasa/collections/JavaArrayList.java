package com.avivasa.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaArrayList {

	
	
	public static void main(String[] args) {

		/*
		 * 5 
		 * 5 41 77 74 22 44 
		 * 1 12 
		 * 4 37 34 36 52 
		 * 0 
		 * 3 20 22 33 
		 * 5 
		 * 1 3 
		 * 3 4 
		 * 3 1 
		 * 4 3
		 * 5 5
		 */

		Scanner scanner = new Scanner(System.in);

		int numOfinputLines = scanner.nextInt();
		
		scanner.nextLine();

		List<LineData> inputList = new ArrayList<LineData>();
		List<QueryTuple> queryList = new ArrayList<QueryTuple>();
		
		
		
		// TODO scanner dan herbir satiri okuyup tokenize ederek arraylist e atmaliyiz.
		
		
		

		for (int i = 0; i < numOfinputLines; i++) {
			
			
			String line = scanner.nextLine();
			
			inputList.add(convertLineData(line, i+1));
			
		}

		/*
		 * for (int i = 0; i < inputList.size(); i++) {
		 * System.out.println(inputList.get(i)); } System.out.println();
		 */

		int queryCount = scanner.nextInt();
		
		scanner.nextLine();
		
		
		for (int i = 0; i < queryCount; i++) {
			int x = scanner.nextInt();  int y = scanner.nextInt();
			
			queryList.add(new QueryTuple(x, y));
			
			scanner.nextLine();
		}
		
		
		
		
		for (int i = 0; i < queryCount; i++) {
			
			int x = queryList.get(i).x; 
			int y = queryList.get(i).y;
			
			
			if(inputList.get(x-1) != null && (inputList.get(x-1).lineNumbers.get(0)!=0)){
				
				if(inputList.get(x-1).lineNumbers.size() > y ){
					System.out.println(inputList.get(x-1).lineNumbers.get(y).intValue());
				}else{
					System.out.println("ERROR!");
				}
			}else
			{
				System.out.println("ERROR!");
			}
			
			
			
		}

		
	}
	
	
	protected static LineData convertLineData(String inputStr, int lineIndex){
		
		StringTokenizer st = new StringTokenizer(inputStr);
		LineData lineData = new LineData();
		
		
		lineData.lineIndex = lineIndex;

		while (st.hasMoreElements()) {
			lineData.lineNumbers.add(new Integer(st.nextElement().toString()));
		}
		return lineData;
	}

}

class LineData {
	public int lineIndex;
	public ArrayList<Integer> lineNumbers;

	public LineData() {
		lineNumbers = new ArrayList<Integer>();
	}
	

}
class QueryTuple{
	public int x;
	public int y;
	
	public QueryTuple(int _x,int _y){
		x = _x; y = _y;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
