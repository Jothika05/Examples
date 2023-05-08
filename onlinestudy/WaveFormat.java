package onlinestudy;

import java.util.Arrays;
import java.util.Scanner;
//what is wave format
//sort array in descending order
//swap the adjacent element
public class WaveFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size  array:");
	    int n=sc.nextInt();

	    int[] arr=new int[n];
	    System.out.println("Enter the elements of  array:");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    int desc[]=new int[arr.length];
	    int index=0;
	    for(int i=arr.length-1;i>=0;i--) {
	    	desc[index++]=arr[i];
	    }
	    System.out.println(Arrays.toString(arr));
	    for(int i=0;i<desc.length-1;i+=2) {
	    	int temp=desc[i];
	    	desc[i]=desc[i+1];
	    	desc[i+1]=temp;
	    }
	    System.out.println(Arrays.toString(desc));
	} 

}
