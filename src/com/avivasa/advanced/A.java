package com.avivasa.advanced;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class B {}

public class A {
	  private void message(B b)
	  
	  
	  {System.out.println("hello java"); }
	  
	  
	  public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		
		startProcess("Notepad.exe", "C:\\myfile.txt");
		
	}
	  
	  
	  public static int startProcess(
				String executable, String... args) throws IOException {

			
			//Build the command line
			List<String> command = new LinkedList<String>();
			

			

			command.add(executable);
			command.addAll(Arrays.asList(args));

			ProcessBuilder builder = new ProcessBuilder(command);
			Process process = builder.start();

			int returnCode;

			try {
				returnCode = process.waitFor();
			} catch (InterruptedException e) {
				returnCode = 1;
			}

			return returnCode;
		}	  
	  
	}
