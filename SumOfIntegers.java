package com.Bridgelabz.JavaFunctions;

import java.util.Scanner;

public class SumOfIntegers {

			// Prints all triplets in arr[] with 0 sum
			static void findTriplets(int[] arr, int n)
			{
			    boolean found = false;
			    for (int i=0; i<n-2; i++)
			    {
			        for (int j=i+1; j<n-1; j++)
			        {
			            for (int k=j+1; k<n; k++)
			            {
			                if (arr[i]+arr[j]+arr[k] == 0)
			                {
			  			      System.out.println("Triplets are ");
			                    System.out.print(arr[i]);
			                    System.out.print(" ");
			                    System.out.print(arr[j]);
			                    System.out.print(" ");
			                    System.out.print(arr[k]);
			                    System.out.println();
			                    found = true;
			                }
			            }
			        }
			    }
			 
			    // If triplet with 0 sum not found in array
			    if (found == false)
			        System.out.println(" Triplets not exist ");
			 
			}
			 
			//Main Method
			public static void main(String[] args)
			{
			    int arr[] = new int[5];
			    Scanner sc=new Scanner (System.in);
			    System.out.println("Enter Array Elements  ");
			     // input
			      for(int i=0;i<5;i++)
			      { 
			    	   arr[i]=sc.nextInt();
			      }
			      
			      System.out.println("Elements of array ");
			     
			      //output
			      
			      for(int i=0;i<5;i++)
			      {
			       System.out.print(arr[i]+" ");   
				  }
			      
			      System.out.println();
			      
			      //int n =arr.length, to take length array as a user input 
			      findTriplets(arr, 5);
			 
			}
			}
			
