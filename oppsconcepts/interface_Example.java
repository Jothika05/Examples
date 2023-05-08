package oppsconcepts;
interface  proud1{
	public void print_proud();
	
}
interface proud2{
	public void print_ToBe();
}
interface proud3 extends proud1,proud2{
	public void print_indian();
}
class Children implements proud3{
	public void print_proud() {
	   System.out.println("Proud");	
	}
	public void print_ToBe() {
		   System.out.println("ToBe");	

	}

	public void print_indian() {
		   System.out.println("Indian");	

	}
}
public class interface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Children c=new Children();
     c.print_proud();
     c.print_ToBe();
     c.print_indian();
     
	}

}
