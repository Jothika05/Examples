package onlinestudy;

import java.util.Scanner;

public class DecimaltoBinary {
   public static void converter(int n) {
	   if(n>0) {
		   converter(n/2);
		   System.out.println(n%2);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int n=sc.nextInt();
		 converter(n);
	}

}

