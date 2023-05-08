package codings;

import java.util.Scanner;

public class code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int count_in=sc.nextInt();
       int count_out=sc.nextInt();
       
       double total_internal_area=0;
       double total_external_area=0;
       
       for(int i=1;i<=count_in;i++) {
    	   total_internal_area+=sc.nextDouble();
	    }
       for(int i=1;i<=count_out;i++) {
    	   total_external_area+=sc.nextDouble();
	   }
       
       double cost=(total_internal_area*18.0)+(total_external_area*12.0);
       System.out.println("Total Estimate Cost: " +cost+" INR");
       

}
}