package onlinestudy;

import java.util.Scanner;

public class MaxMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size  array:");
	    int n=sc.nextInt();

	    
	    int[] arr=new int[n];
	    System.out.println("Enter the elements of first array:");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int max=arr[0];
	    int min=arr[0];
	    for(int i=0;i<arr.length;i++) {
	    	max=Math.max(max, arr[i]);
	    	min=Math.min(min, arr[i]);
	    }
	    int res=max-min;
		System.out.println(res);
	}

}
