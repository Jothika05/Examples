package codings;

import java.util.Scanner;

public class code8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         String order_id=sc.next();
         
         int otp=1;
         for(int i=0;i<order_id.length();i++) 
         {
        	 int digit=Integer.parseInt(String.valueOf(order_id.charAt(i)));
        	 otp*=digit;
         }
         System.out.print(otp);
}
}