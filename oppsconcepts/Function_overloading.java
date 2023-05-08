package oppsconcepts;

class multiflyfun{
  static int multiply(int a,int b) {
	  return a*b;
     }
  static double multiply(double a,double b) {
	  return a*b;
     }
}
  public class Function_overloading{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(multiflyfun.multiply(4, 5));
    System.out.println(multiflyfun.multiply(4.0, 5.0));
	}

}
