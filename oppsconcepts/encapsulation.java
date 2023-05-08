package oppsconcepts;

public class encapsulation {
    private  String studentName;
    private int studentRoll;
    private int studentAge;
    
    public  String getstudentName() {
		return studentName;
    	
    }
    public void setstudentName(String studentName) {
    	this.studentName=studentName;
    }
    
    public int getstudentRoll() {
		return studentRoll;
    	
    }
    public void setstudentroll(int studentRoll) {
    	this.studentRoll=studentRoll;
    }
    
    public  int getstudentAge() {
		return studentAge;
    	
    }
    public void setstudentAge(int getstudentAge) {
    	this.studentAge=studentAge;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      encapsulation e=new encapsulation();
      e.setstudentName("arul");
      e.setstudentAge(22);
      e.setstudentroll(5);
      System.out.println("My name is" + e.getstudentName() + "my age is"+ e.getstudentAge()+"my roll number is"+ e.getstudentRoll() );
	}

}
