package Array;

import java.util.Scanner;

public class example2{



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
    
     int max=num[0];
    for( i=0;i<n;i++) {
    	if(num[i]>max) {
    		max=num[i];
    	}
    }
    System.out.println("largest number is"+max);
    
    int min=num[0];
    for( i=0;i<n;i++) {
    	if(num[i]<min) {
    		min=num[i];
    	}
    }
    System.out.println("smallest number is"+min);
     }
}
