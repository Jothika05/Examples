package onlinestudy;

import java.util.Scanner;

public class DigitSum {
 public static int sum(int n) {  //123
	 if(n==0)
		 return 0;
	 else
		 return n%10+sum(n/10);  //  3+sum(12),
	                             //2+sum(1),
	                              //1+sum(0) (stack)-->sum(0)=return 0=0 --> so 1+0=1,2+1=3,3+3=6
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int n=sc.nextInt();
	    System.out.println("Sum of digit is"+sum(n));

	}

}
