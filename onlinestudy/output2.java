package onlinestudy;

import java.util.Scanner;

public class output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //1.To convert temparature from Farenheit to celcious[C=5/9*(F-32);
		// double f=145f;
		
	       Scanner sc=new Scanner(System.in);
	       double F=sc.nextDouble();
	       double C=5.0/9*(F-32);
	       System.out.println("Temparature in Farenheit: "+F);
	       System.out.println("Temparature in Celciouus: "+C);
	       
	  // 2.To find the biggest number out of thre  numbers using teneray operator 
	       int a=sc.nextInt();
	       int b=sc.nextInt();
	       int c=sc.nextInt();
	       int big=(a>b&&a>c)?a:(b>c)?b:c;
	       System.out.println("Big no is: "+big);
	       
	 //3.Take input from user CP and SP and calculate  the profit / loss%
	       System.out.println("enter the cp: ");
	       float cp=sc.nextFloat();
	       System.out.println("enter the sp: ");
	       float sp=sc.nextFloat();
	       float res=(cp>sp)?((cp-sp)/cp*100):((sp-cp)/cp*100);
	       System.out.println(res);
	       
	 //4.To find the roots of an quardratic Equation
	       System.out.println("Enter a,b,c for the quaratic equation ax2+bx+c=0");
	       a=sc.nextInt();
	       b=sc.nextInt();
	       c=sc.nextInt();
	       
	       double d=Math.sqrt((double)(b*b)-(4*a*c));
	       double r1=(-b+d)/2.0*a;
	       double r2=(-b-d)/2.0*a; 
	      /* double d=(b*b)-(4*a*c);
	       double r1=(-b+Math.sqrt(d))/2.0*a;
	       double r2=(-b-Math.sqrt(d))/2.0*a; */
	       System.out.println("Roots are "+d+ "and" +r2);
	       
	       
	       
	       
	       
	}

}
