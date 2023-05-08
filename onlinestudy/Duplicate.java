package onlinestudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size:");
	    int n=sc.nextInt();
	   
	    int[] arr=new int[n];
	    System.out.println("Enter the array elements:");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	   // System.out.println(Arrays.toString(arr));
	    ArrayList temp=new ArrayList<>();
	    temp.add(arr[0]);
	    for(int i=1;i<arr.length;i++) {
	    	if(arr[i]==arr[i-1])
	    		continue;
	    	else
	    		temp.add(arr[i]);
	    		
	    }
	    System.out.println(temp);
	}

}
