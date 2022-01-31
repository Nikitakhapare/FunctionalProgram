package com.Bridgelabz.JavaFunctions;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		
	   // String T=args[0];
	    double T=Double.parseDouble(args[0]);
	   // String V=args[1];
	    double V=Double.parseDouble(args[1]);
	    System.out.println(T);
	    System.out.println(V);

	   if(T>=50 && V>120 || V<3)
	    {
	    	
	        double W=35.74 + 0.6215*T + 0.4275*T*Math.pow (V,0.16)-35.75 *Math.pow(V,0.16);
	    
	          System.out.println("WndChill= "+W);
	    }

	    else 
		      System.out.println(" Invalid input  ");

	}

}
