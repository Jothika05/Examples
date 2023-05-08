package onlinestudy;

import java.util.Scanner;

public class Fibonacci {
public static int fib(int n) {
	
	if(n<=1)
	  return n;
	else
		return  fib(n-1)+fib(n-2);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++) {
	         System.out.println(fib(i)+" ");
	}

}
}