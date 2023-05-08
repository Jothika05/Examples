package onlinestudy;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of rows:");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++) 
         {
            	for(int space=n-1;space>=i;space--) 
	             {
	            	System.out.print(" ");
	             }
            	 for(int j=1;j<=i;j++)
		         {
		             	System.out.print(j);
		          }
                 for(int k=i-1;k>=1;k--) 
                 {
                	 System.out.print(k);
                 }
	          System.out.println();
	        }
 System.out.println("=========================================");
        System.out.println("Enter no of rows:");
 	    int n1=sc.nextInt();
 	    int k=1;
 		for(int i=1;i<=n1;i++) {
 			for(int j=1;j<=i;j++) {
 				System.out.print(k++);
 			}
 			System.out.println();
 		}
 		
System.out.println("=========================================");
		
 		 System.out.println("Enter no of rows:");
         int n2=sc.nextInt();
         int a=64;//a=64 or a=96
  		for(int i=1;i<=n2;i++) {
  			for(int j=1;j<=i;j++) {
  				System.out.print((char)(a+j));
  			}
  			System.out.println();
  		}
 	
	}

}
