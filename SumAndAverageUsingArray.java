package anudip_assignment;

import java.util.Scanner;

public class SumAndAverageUsingArray 
{

	public static void main(String[] args) 
	{
		
        int sum=0;
        int avg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Enter 5 Integers --");
        int arr[] = new int[5];
        //initiate a for loop for entering numbers.
        for(int i=0; i<5; i++)
        {
            System.out.print("\nEnter number : ");
            arr[i] =sc.nextInt();
        }
        //initiate a for loop for displaying a numbers in an array.
        System.out.print("Number inside array: ");
        
        for (int i=0;i<5;i++)
        {
             System.out.print(arr[i]+" ");
            
             sum +=arr[i];
             avg =sum/5;
        }
        System.out.println();
        //printing the sum of numbers in an array.
        System.out.println("Sum of numbers inside the array: " + sum);
       //printing the average of numbers in an array.
        System.out.println("Average of numbers inside the array: " + avg);
    }
}

