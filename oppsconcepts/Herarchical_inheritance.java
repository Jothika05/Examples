package oppsconcepts;

 class First{
	 void print_we() {
			System.out.println("We");
		}
	}
class Second extends First{
	 void print_love(){
			System.out.println("love");
		
		}
	}
class Third extends First{
		 void print_indian(){
			System.out.println("indian");
		
		}
	}

	public class  Herarchical_inheritance {
           public static void main(String[] args) {
	  Third g=new Third();
	  g.print_we();
	  Second  t=new Second();
	  t.print_love();
	  g.print_indian();

		}

	}

	
	
	
	