package anudip_assignment;

import java.util.Scanner;

public class LargeSmallNoInArray 
{

	public static void main(String[] args)
	{

		    Scanner sc = new Scanner(System.in);
	        System.out.print("--Enter 10 numbers--");
	    	//int n = sc.nextInt();
	        int arr[]=new int[10];
	       
	        for(int i=0; i<10; i++)
	        {
	            System.out.print("\nEnter number: ");
	            arr[i] =sc.nextInt();
	        }
	        
	        //for loop for large numbers and small numbers
	        int large = arr[0];
	        int smallest=arr[0];
	        for (int i = 1; i <10; i++)
	        {
	            if(arr[i] > large)
	            {
	                large = arr[i];
	            }
	            if (arr[i] < smallest) 
	            {
	                smallest = arr[i];
	            }
	        }
	        System.out.print("Numbers inside the array: ");
	        for (int i = 0; i <10; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("largest number: " + large);
	        System.out.println("smallest number: " + smallest);

	        sc.close();
	    }
}