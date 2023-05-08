package examples;

import java.util.Scanner;

public class example4 {
    public static void main(String args[]) {
    boolean flag=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	
	 
	  int[]num=new int[n]; 
	  for(int i=0;i<n;i++) {
		System.out.println("enter the elements of array"+i+" :");
		num[i]=sc.nextInt();
		}
	  System.out.println("Elements entererd in given array:");
	  for(int i=0;i<n;i++) {
		  System.out.println(num[i]+" ");
	  }
	  System.out.println();
	  System.out.println("prime element in the given array are:" );
	  for(int i=0;i<n;i++) {
		  flag=true;
		  if(num[i]>1) {
			  for(int j=2;j<num[i];j++) {
				  if(num[i]%j==0) {
					  flag=false;
					  break;
					  }
				   }
			  
			  if(flag==true) {
				  System.out.println(num[i]+" ");

			  }
		  }
	  }
    }  
    }  
		  
		  
		  
		  
		  
		  
		  
		  
	
	  