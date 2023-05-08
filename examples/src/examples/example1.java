package examples;

import java.util.Scanner;

public class example1 {
/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
	    int n=sc.nextInt();
	    if(n%2==0 && n>=6 ) {
	    	if(n<65) {
	    	  System.out.println("wired");
	      }
	    }
	    
	    else {
	    	System.out.println("not wired");
	    }
	}
}
*/
	/*  n is odd --> print weird 
	 *  n is even and range  6 to 20 -->  weired
	 *  n is even and range  2 to 5 --> not weired
	 * n is even and greater than 20 --> not weired 
	 * */
	
	
	/*
	
	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        if(n%2==0 && n>20  ) {
	    	System.out.println("not weired");
        }
        
        else if( n%2==0 && n>=2 &&n<=5) {
	    	System.out.println("not weired");
          }
        
        else if(n<=6 && n>=20) {
	    	System.out.println("weired");
         }
    
        else{
	    	System.out.println("weired");
	    	paru 5 type pana wried  varuthu

        }
	
	
	}
}
	
	*/public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (n%2==1){
      System.out.println("Weird");
  }
  else if(n%2==0 && (n>=2 && n<=5)){
      System.out.println("Not Weird");
  }
  else if(n%2==0 && (n>5 && n<=20)){
      System.out.println("Weird");
  }
  else if(n%2==0 && (n>20 && n<=100)){
      System.out.println("Not Weird");
    }


}
}

	
	
	
	
	
	
	
	
	
	
	
	
	