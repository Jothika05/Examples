package codings;

import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 1 2 3 4 5 6  7  8   9 10 11 12  13  14  15 16
         // 1 1 2 3 4 9  8  27 16 81 32 243 64 729 128 2187
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long term;
		if(n%2==1) {
			term=(long) Math.pow(2, (n-1)/2);
			
		}
		else
		{
			term= (long) Math.pow(3, (n/2)-1);

			
		}
		
		System.out.println(term);
		}
	

}
	


