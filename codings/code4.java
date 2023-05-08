package codings;

import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		int v=sc.nextInt();
        		if(v>=1&& v<=100) 
        			arr[i][j]=v;
             }
        }
        
        int t1,t2,t3;
        t1=Math.round(arr[0][0]+arr[1][0]+arr[2][0])/3;
        t2=Math.round(arr[0][1]+arr[1][1]+arr[2][1])/3;
        t3=Math.round(arr[0][2]+arr[1][2]+arr[2][2])/3;

        int max=Math.max(t1, Math.max(t2, t3));
        if(max<70) {
         System.out.println("All trainees are unfit");	
        }
        else {
        	if(max==t1)
                System.out.println("Trainee Number: 1");	
        	if(max==t2)
                System.out.println("Trainee Number: 2");	
        	if(max==t3)
                System.out.println("Trainee Number: 3");	

        	
        }

	}

}
