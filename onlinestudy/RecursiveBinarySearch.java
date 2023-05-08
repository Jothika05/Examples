package onlinestudy;

import java.util.Scanner;

public class RecursiveBinarySearch {
   public static int Bsearch(int arr[],int value,int left,int right) {
	  if(left>right) 
		  return -1;
	  int mid=(left+right)/2;
	  if(value==arr[mid])
		  return mid;
	  else if(value<arr[mid])
		  return Bsearch(arr,value,left,mid-1);
	  else
		  return Bsearch(arr,value,mid+1,right);
	   }
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
	    System.out.println("enter the element to be searched:");
	    int n1=sc.nextInt();
	   int result= Bsearch(arr,n1,0,arr.length-1);
	   if(result==-1)
	    System.out.println("not found" );
	   else
		   System.out.println("found at index:"+result);

}
}