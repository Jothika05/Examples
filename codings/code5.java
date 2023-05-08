package codings;

import java.io.IOException;
import java.util.Scanner;

public class code5 {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        
        if(weight<=0)
        	System.out.println("INVALID INPUT");
        else if(weight>7000)
        	System.out.println("OVERLOADED");
        else if(weight<=2000)
        	System.out.println("Time Estimated: 25 minutes");
        else if(weight>=2001 && weight<=4000)
        	System.out.println("Time Estimated: 35 minutes");
        else
        	System.out.println("Time Estimated: 45 minutes");
        
	}

}
