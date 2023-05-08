package oppsconcepts;
class Bicycle{
	public int gear;
    public	int speed;
    
    public Bicycle(int gear,int speed) {
     this.gear=gear;
     this.speed=speed;
    }
    
    public void applyBreak(int decrement)
    {
    	speed-=decrement;
    }
    public void  speedup(int increment)
    {
    	speed+=increment;
    }
    public String toString()
    {
    	return ("No of gears are  "+gear+"  and , speed of a bicycle is "+speed);
    }
 }
class  MountainBike extends Bicycle {
    public int seatHeight;
	public MountainBike(int gear, int speed,int startHeight) {
		super(gear, speed);
		seatHeight=startHeight;
	}
	public void seatHeight(int newValue) {
		seatHeight=newValue;
	}
	public String toString() {
		return (super.toString()+", seat height is "+seatHeight);
		
	}
}
	public class Inheritance_Example {
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(5, 200, 26);
		System.out.println(mb.toString());
		mb.applyBreak(56);
		System.out.println(mb.toString());
	}

}
