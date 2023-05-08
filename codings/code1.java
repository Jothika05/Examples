package codings;

import java.util.Scanner;

public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 // 1 2 3 4 5 6 7 8 9 10 11 12
//  0 0 2 1 4 2 6 3 8 4  10	5	
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long term;
		if(n%2==1) {
			term=n-1;
		}
		else
		{
			term=(n-2)/2;
		}
		System.out.println(term);
	}

}
