package onlinestudy;


 
import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {

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
	    for(int i=0;i<len-1;i++)
	    	
	    {
	    	int min_index=i;
	    	for(int j=i+1;j<len;j++) {
	    		if(n1[j]<n1[min_index]) 
	    			min_index=j;
	    		
	    	}
	    	    int temp=n1[i];
    			n1[i]=n1[min_index];
    			n1[min_index]=temp;
	    	}
	    
	
	    
	        System.out.println("Sorted elements are:"+ Arrays.toString(n1));
	    

	}

}
