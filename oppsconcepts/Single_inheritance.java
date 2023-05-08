package oppsconcepts;
class Parent{
    void one(){
		System.out.println("class of parent");
	}
}
class Child extends Parent{
    void two(){
		System.out.println("class of child");
     }
}
public class Single_inheritance {

  public static void main(String[] args) {
     Child c=new Child();
     c.one();
     c.two();
	}

}
