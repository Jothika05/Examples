package examples;

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size");
		int n=sc.nextInt();
			
	 int a[]= new int[n];
	 System.out.println("enter the "+n+" number");
	  for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
      
      int b[]= new int[n];
  	System.out.println("enter the number");
      for(int i=0;i<n;i++) {
		b[i]=sc.nextInt();
		}
     
		//int a[]= {3,4,5};
		//int b[]= {5,3,4};
		
		int c[]=new int[b.length];
		
		for(int i=0;i<c.length;i++) 
		{
        c[i]=a[i]*b[i];

		}
       
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

	}

