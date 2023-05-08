package onlinestudy;

import java.util.Arrays;
import java.util.Scanner;

/*public class binarysearch {

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
	 
	    System.out.println("Enter the number to  searched:");
	    int val=sc.nextInt();
        int l=0,r=n1.length,mid;
        int index=-1;
        while(l<=r) {
        	mid=l+(r-l)/2;
        	if(n1[mid]>val)
        		r=mid-1;
        	else if(n1[mid]<val)
        		r=mid+1;
        	else { 
        		index=mid;
        	    break;
            }
	    
        }
		
		if(index==-1)
		    System.out.println("not found");
		else
			 System.out.println("fount at index of:"+index);  */
	

	public class binarysearch{
		public static void main(String[] args) {
			int   first, last, middle;
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the size  array:");
		    int size=sc.nextInt();

		    
		    int[] n=new int[size];
		    System.out.println("Enter the elements of first array:");
		    for(int i=0;i<n.length;i++) {
		    	n[i]=sc.nextInt();
		    }
		    System.out.println("Enter the number to  searched:");
		    int key=sc.nextInt();
		    
			first = 0; 
			last = size-1; 
			middle = (first+last)/2;
			while(first<=last) { 
				if(n[middle]<key) {
					first = middle+1; } 
				else if(n[middle]==key) { 
					System.out.println("\nThe element is available at Index No." +middle); 
					break; 
					}
				else { 
					last = middle-1; 
					}
				middle = (first+last)/2; 
				} 
			if(first>last) {
				System.out.println("\nThe element is not available in given array"); }
			
	}

}
