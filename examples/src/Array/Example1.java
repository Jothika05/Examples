package Array;

import java.util.Scanner;

public class Example1 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the limit");
	     int n=sc.nextInt();
	     int i=0;
	     
	     int num[]=new int[n];
	     System.out.print("enter the number of elements:");
	     for( i=0;i<n;i++) {
	    	 num[i]=sc.nextInt();
	    	  }
	     System.out.println();
	     System.out.print("reverse order is ");
	     for( i=n-1;i>=0;i--) {
	    	 System.out.print(num[i] + "  ");
	    	 }
		}
}
	    
