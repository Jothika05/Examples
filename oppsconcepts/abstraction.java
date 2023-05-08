package oppsconcepts;
abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	
	public Shape (String color) {
		 System.out.println("Shape constructor is called");
		 this.color=color;
	}
	public String getcolor() {
		return  color;
	}
}
class Circle extends Shape{
	double radious;
	
	public Circle(String color,double radious) {
		 super(color);
		 System.out.println("Circle constructor is called");
		 this.radious=radious;
	}
	@Override
	double area() {
		
		return Math.PI*Math.pow(radious, 2);
	}
	@Override
	public String toString() {
		return "Circle color is" +super.color + "and area is " + area() ;
	}
	
}
class  Rectangle extends Shape{
	double length;
	double width;
	
	public  Rectangle(String color,double length,double width) {
		 super(color);
		 System.out.println("Rectangle  constructor is called");
		 this.length=length;
		 this.width=width;
	}
	@Override
	double area() {
		
		return length*width;
	}
	@Override
	public String toString() {
		return "rectangular color is" +super.color + "and area is " + area() ;
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shape s1=new Circle("Red",2.2);
    Shape s2=new Rectangle("Red",2,6);
    System.out.println(s1.toString());
    System.out.println(s2.toString());
	}

}
