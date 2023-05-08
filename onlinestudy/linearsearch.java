package onlinestudy;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    int size=sc.nextInt();
        int i;
	    
	    int[] n=new int[size];
	    System.out.println("Enter the elements of first array:");
	    for( i=0;i<n.length;i++) {
	    	n[i]=sc.nextInt();
	    }
	    System.out.println("Enter the number to  searched:");
	    int key=sc.nextInt();
	    
	    for(i=0;i<n.length;i++) {
	    	if(n[i]==key) {
	    		System.out.println("element found at index :"+i);
	    		break;
	    	}
	    }
	    
	    if(i==n.length){
	    			System.out.println("element not found");
	          }
	    
	    } 
	}

