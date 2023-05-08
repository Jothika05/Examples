package codings;

import java.util.Scanner;

public class code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=10,k=5;
		int user=sc.nextInt();
		if(user>(N-k)) {
			System.out.println("INVALID INPUT");
		}
		else if(user==0) {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDICS LEFT: "+N);
		}
		else {
			System.out.println("NUMBER OF CANDICS SOLD: "+user);
			System.out.println("NUMBER OF CANDICS AVAILABLE: "+(N-user));
		}
	}

}
