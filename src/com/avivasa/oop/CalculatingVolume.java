package com.avivasa.oop;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate{
	
	Scanner scanner;
	public Calculate(){
		
		scanner = new Scanner(System.in);
		
	}
	
	public Calculate(String test){}
	
	public static Calculate output = null;

	public int getINTVal() throws IOException {
	
		int intInp = Integer.parseInt(scanner.nextLine().trim());
		
		if(intInp <= 0) throw new NumberFormatException("All the values must be positive");
		
		return intInp;
	}
	
	public double getDoubleVal() {
		
		double doubleInp = Double.parseDouble(scanner.nextLine().trim());
		
		if(doubleInp <= 0.000) throw new NumberFormatException("All the values must be positive");
		
		return doubleInp;
	}

	public static Calculate get_Vol() {
		if(output == null){

			output = new Calculate();
		}
		
		return output;
	}
	
	public static Calculate output() {
		return get_Vol();
	}
	
	//cube
	public double main(int a) {
		double res = a*a*a;
		return Math.round(res*1000.0) / 1000.0;
		
	}

	// cylinder
	public double main(double r, double h) {
		double res = Math.PI *r*r*h; 
		return Math.round(1000.000 * res)/1000.000;
	}

	// hemisphere 
	public double main(double r) {
		double result = (2*Math.PI * r*r*r)/3 ;
		return Math.round(result*1000.000) / 1000.000;
	}

	public double main(int l, int b, int h) {
		
		return l * b * h;
	}

	public void display (double a) {
		System.out.printf("%.3f\n",a);
	}
	
	
}


public class CalculatingVolume
{
	
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}}

	
	
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	
	


