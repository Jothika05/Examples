package Array;


import java.util.Scanner;

public class Example3{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    
    int a[]=new int[n];
    System.out.println("enter all the "+ n + " elements");
    for (int i=0;i<n;i++) {
      a[i]=sc.nextInt();
    }
   
    int temp;
    for (int i=0;i<n;i++) {
    	for (int j=i+1;j<n;j++) {
            if(a[i]<a[j]) {
    	       temp=a[i];
    	       a[i]=a[j];
    	       a[j]=temp;
            }
       }
}
    System.out.println("descending order");
    for( int i=0;i<n;i++) {
      System.out.println(a[i]+" ") ;
	}
    System.out.println("User enter the input number");
    int k=sc.nextInt();
    System.out.println( a[k-1]);
    
}
	
	
}