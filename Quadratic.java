package com.Bridgelabz.JavaFunctions;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

	       System.out.println("Enter value of a b c ");
	       Scanner sc=new Scanner (System.in);
	       double a=sc.nextDouble();
	       double b=sc.nextDouble();
	       double c=sc.nextDouble();
	      
	     // quadratic equation x= (-b(+-)Sqrt(b2-4ac)))/2a

          double detarminant=b*b - 4*a*c;
          System.out.println("detarminant "+detarminant);
          
          //int Root=a*X1*X2 + b*X1 + c;
          
          if(detarminant>0) {
        	  double root=Math.sqrt(detarminant);
              
              
              double firstRoot=(double)(-b + root)/(2*a);
              
              double  secondRoot=(double)(-b - root )/(2*a);
              

          System.out.println("Root of the Equation is "+firstRoot+" and "+secondRoot);
          }
          else {
          System.out.println("Root are imaginary");
          }
          
          
          
	}

}
