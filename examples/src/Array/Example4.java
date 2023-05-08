package Array;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the limit");
	     int n=sc.nextInt();
	    
	     
	     int num[]=new int[n];
	     System.out.print("enter the number of elements:");
	     for(int i=0;i<n;i++) {
	    	 num[i]=sc.nextInt();
	    	  }
	     System.out.println();
	     System.out.println("entered number of elements are:");
	     for(int i=0;i<n;i++){
	    	 System.out.println( num[i] + " ");
	    }
	     System.out.println("enter the user input");
	     int inp=sc.nextInt();
	     int count=0;
	     for(int i=0;i<n;i++) {
	    	 if(num[i]==inp) {
	    		 count++;
	    	 }
	     }
	    	 System.out.println("frequency of "+inp +" is  "+count);
	     }
	}

