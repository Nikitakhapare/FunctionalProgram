package com.Bridgelabz.JavaFunctions;


public class Distance {

	public static void main(String[] args) {

      // System.out.println("Enter Point x ");
       double x=Double.parseDouble(args[0]);
	    System.out.println(x);

     //  System.out.println("Enter Point y ");
       double y=Double.parseDouble(args[1]);
	    System.out.println(y);

        //int dist=( int) Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
       // (x-0) because calculating from origin
       
         double dist=(double) Math.sqrt(Math.pow((x-0),2)+Math.pow((y-0),2));

         System.out.println("Euclidean Distance "+dist);
	}

}
