package oppsconcepts;
class high{
	void print() {
		System.out.println("parent class");
	}
}
class subclass1 extends high{
	void print() {
		System.out.println("subclass1");
	}
}
class subclass2 extends high{
	void print() {
		System.out.println("subclass2");
	}
}
public class function_overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   high p=new subclass1();
   p.print();
   p=new subclass2();
   p.print();
   p=new high();
   p.print();
	}

}
