package onlinestudy;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size  array:");
	    int n=sc.nextInt();

	    
	    int[] n1=new int[n];
	    System.out.println("Enter the elements of first array:");
	    for(int i=0;i<n1.length;i++) {
	    	n1[i]=sc.nextInt();
	    }
	    int len=n1.length;
	    boolean swap=false;
	    for(int i=0;i<len-1;i++) 
	    {
	    	for(int j=0;j<len-1-i;j++)
	    	{
	    		if(n1[j]>n1[j+1])
	    		{
	    			int temp=n1[j];
	    			n1[j]=n1[j+1];
	    			n1[j+1]=temp;
	    			swap=true;
	    		}
	    	}
	    	if(swap==false)
	    		break;
	    }
	    System.out.println("Sorted elements are:"+ Arrays.toString(n1));
	  
	    
	}

}
