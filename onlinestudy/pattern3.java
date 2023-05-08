package onlinestudy;

import java.util.Scanner;

public class pattern3 {

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
			             	System.out.print("* ");
			            }
		          System.out.println();
		        }
		         System.out.println("=========================================");

		         System.out.println("Enter no of rows:");
		         int n1=sc.nextInt();
		         for(int i=1;i<=n1;i++) 
		         {
		            	for(int space=n1-1;space>=i;space--) 
			             {
			            	System.out.print(" ");
			             }
			           for(int j=1;j<=i;j++)
			            {
			             	System.out.print(i+" ");
			            }
		          System.out.println();
		        }
		         System.out.println("=========================================");

		         System.out.println("Enter no of rows:");
		         int n2=sc.nextInt();
		         for(int i=1;i<=n2;i++) 
		         {
		            	for(int space=n2-1;space>=i;space--) 
			             {
			            	System.out.print(" ");
			             }
			           for(int j=1;j<=i;j++)
			            {
			             	System.out.print(j+" ");
			            }
		          System.out.println();
		        }
		         System.out.println("=========================================");


}
}