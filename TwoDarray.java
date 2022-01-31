package com.Bridgelabz.JavaFunctions;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter rows  ");
                int rows=sc.nextInt();
			 System.out.println("Enter colm  ");
                int colm=sc.nextInt();

		     int[][] arr = new int[rows][colm];
		     System.out.println("Enter Array Elements  ");
		     // input
		      for(int i=0;i<rows;i++)
		        {
			       for(int j=0;j<colm;j++)
  
		             { 
		    	       arr[i][j]=sc.nextInt();
				   

		             }
		          
		        }
		       System.out.println("Elements of array ");

		         //output
		      for(int i=0;i<rows;i++)
		      {    
			    	System.out.println();

			      for(int j=0;j<rows;j++)
			    	  
		             System.out.print(arr[i][j]+"\t ");   
    		  }
		    	System.out.println();


		}
		

	}



