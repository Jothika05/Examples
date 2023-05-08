package onlinestudy;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of rows:");
        int n=sc.nextInt();
        int space=n-1;
        int i,j;
  		for( i=1;i<=n;i++) {
  			for( j=1;j<=space;j++) 
  			{
  				System.out.print(" ");
  			}
  			space--;
  			for( j=1;j<=(i*2-1);j++)
  			{
  			System.out.print("*");
  		    }
  			System.out.println();
  		
  		}
  		
  		 space=1;
  		  
  		 for( i=1;i<=n-1;i++) {
  			for(j=1;j<=space;j++)
  			{
  				System.out.print(" ");
  			}
  			space++;
  			for(j=1;j<=2*(n-i)-1;j++)
  			{
  	  			System.out.print("*");
  	  		}
  	  			System.out.println();
  	  		
  	  		}
	}

}
