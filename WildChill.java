package com.Bridgelabz.JavaFunctions;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		
	   // String t=args[0];
	    double t =Double.parseDouble(args[0]);
	   // String v=args[1];
	    double v=Double.parseDouble(args[1]);
	    System.out.println(t);
	    System.out.println(v);

	   if(T>=50 && V>120 || V<3)
	    {
	    	
	        double w=35.74 + 0.6215*T + 0.4275*T*Math.pow (V,0.16)-35.75 *Math.pow(V,0.16);
	    
	          System.out.println("WndChill= "+w);
	    }

	    else 
		      System.out.println(" Invalid input  ");

	}

}
