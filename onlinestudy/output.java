package onlinestudy;

import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		// TODO Auto-generated methd stub
		//1.
		
		  String s2="Jothi"; String s3="Jothi";
		  System.out.println(s2==s3);//true
	      System.out.println("s2==s3: is" +s2==s3);  //false
	      System.out.println("s2==s3: is" +s2.equals(s3)); //true
	      //2.
	      System.out.println('j'+'a'+'v'+'a');
	      System.out.println("6"+"7");
	      //3
	      int $_=5;
	      //4.
	      double var1=1+5;
	      double var2=var1/4;
	      System.out.println(var2);
	      int var3=1+5;
	      int var4=var3/4;
	      System.out.println(var4);
	      System.out.println(var2+" "+var4);    
	      //5
	      int x=1,y=2,z=3;
	      x=y=z=5;
	      x-=y*=z%=2;
	      System.out.println(x+" "+y+" "+z);
	      //6
	       x=5;
	       x=x++ * 2 +3 * --x;
	       System.out.println(x);
	       //7
	       int a=0,b=30,c=40;
	       a=--a+c+++b;
	       System.out.println(a);
	       //8
	       a=5;
	       b=10;
	       a=++a * a++ %b--;
	       System.out.println(a);
	       //9
	       int n=90;
	        x=10;
	        char ch='z';
	        x=x+ch+n;
	       System.out.println(x);
	       //10
	       System.out.println(1000+200>=1000?(500<300?"yes":(20>10?true:false)):"no");
	       //11
	       System.out.println("ABC\r\rPQ");
	       System.out.println("ABC\r\bPQ");
	       System.out.println("ABC\t\nPQ");
	       
	       //12
	       System.out.println("SOFTWARE\rPROGRAM");
	       System.out.println("HARDWARE\rTEST");
	       
	       //13
	       System.out.println(20&2);
	       System.out.println('A'|'C');
	       System.out.println(15>>3);
	       System.out.println(~20);
	       
	       
	      
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	      
	}

}
