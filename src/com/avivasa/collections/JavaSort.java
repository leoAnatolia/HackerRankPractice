package com.avivasa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

	//TODO Complete the code
	public class JavaSort
	{
		/*
		 * 5
33 Rumpa 3,68
85 Ashis 3,85
56 Samiha 3,75
19 Samara 3,75
22 Fahim 3,76
		 */
	   public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      
	      while(testCases>0){
	    	  
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	      
	      Comparator<Student> c = new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {

				int returnVal = 0;
				Double cgpa1 = new Double(student1.getCgpa());
				Double cgpa2 = new Double(student2.getCgpa());
				
				returnVal = cgpa2.compareTo(cgpa1);
				if(returnVal == 0) returnVal = student1.getFname().compareTo(student2.getFname());

				return returnVal;
			}
		};
	      
	      
	      
		Collections.sort(studentList, c);
	      
	      
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	   }
	}