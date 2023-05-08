package examples;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of elements");
		int n=sc.nextInt();
		
		  int[]num=new int[n]; 
		  for(int i=0;i<n;i++) {
			  System.out.println("enter the position "+i+" :");
			  num[i]=sc.nextInt();
		  }
		  int sum=0;
		  for(int i=0;i<n;i=i+2){
			  System.out.println("even position are:"+ num[i]);
			  sum=sum+num[i];
		  }
		  System.out.println("sum is"+ sum);
		  
		  
		  	}
}