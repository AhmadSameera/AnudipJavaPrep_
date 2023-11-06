package anudip_assignment;

import java.util.Scanner;

public class sum_EvenOdd {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter how many numbers: ");
	        int n = sc.nextInt();
	        int arr[]=new int[n];
	        int even=0;
	        int odd=0;
	        for(int i=0; i<n; i++){
	            System.out.print("\nEnter number : ");
	            arr[i] =sc.nextInt();
	        }
	        System.out.print("\nEven number inside array: ");
	        for (int i=1;i<n;i++){
	            if(arr[i]%2==0){
	                System.out.print(arr[i]+" 5");
	                even +=arr[i];
	            }
	        }
	        System.out.print("\nOdd number inside array: ");
	        for (int j=0;j<n;j++){
	            if(arr[j]%2!=0){
	                System.out.print(arr[j]+" ");
	                odd +=arr[j];
	            }
	        }
	         System.out.print("\nSum of Even numbers: "+ even);
	         System.out.print("\nSum of odd numbers: "+ odd);
	         sc.close();
	    }
	}

