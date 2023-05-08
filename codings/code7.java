package codings;

import java.util.Scanner;

public class code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] arr=new int[N];
		for(int i=0;i<arr.length;i++) 
			arr[i]=sc.nextInt();
		
		int left=0,right=N-1;
		while(left<right) 
		 {
				while(arr[left]%2==0 && left<right)
					left++;
				while(arr[right]%2==1 && left<right)
					right--;
			
			
			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		
		 }	
		for(int i=0;i<N;i++) {
           System.out.print(arr[i]+" ");
		}
	}

}
