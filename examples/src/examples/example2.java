package examples;

import java.util.Scanner;
public class example2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of people");
		int n=sc.nextInt();
		
		 
		  int[]num=new int[n]; 
		  for(int i=0;i<n;i++) {
			System.out.println("enter the people food cost "+i+" :");
			num[i]=sc.nextInt();
			}
		  
		  int gsd = 0, total=0;
		  for(int i=0;i<n;i++) {
             total=total+num[i]; 
		     }
		  gsd=total*18/100+total;
   
          System.out.println("total cost of all people "+ total);
          System.out.println("total gsd of all people "+gsd);
		  }
          
}