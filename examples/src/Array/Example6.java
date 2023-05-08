package Array;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the limit");
	     int n=sc.nextInt();
	     int i=0;
	     
	     int a[]=new int[n];
	     System.out.print("enter the number of elements:");
	     for( i=0;i<n;i++) {
	    	 a[i]=sc.nextInt();
	    	  }
	     System.out.println();
	     
	     
	     int temp;
	     for (i=0;i<n;i++) {
	     	for (int j=i+1;j<n;j++) {
	             if(a[i]<a[j]) {
	     	       temp=a[i];
	     	       a[i]=a[j];
	     	       a[j]=temp;
	             }
	        }
	   }
	     System.out.println("Second Largest number is  "+ a[1] );
	     }
	     
	}

