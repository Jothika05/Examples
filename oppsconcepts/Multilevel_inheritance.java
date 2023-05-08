package oppsconcepts;
class one{
	public void print_we() {
		System.out.println("We");
	}
}
class two extends one{
	public void print_love(){
		System.out.println("love");
	
	}
}
class three extends two{
	public void print_indian(){
		System.out.println("indian");
	
	}
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  three g=new three();
  g.print_we();
  g.print_love();
  g.print_indian();
	}

}
