package collections;

import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
	     st.add("mango");
	     st.add("apple");
	     st.add("banana");
	     st.add("grapes");
         System.out.println(st);
         System.out.println("----------------");


	     System.out.println(st.get(1));
	     System.out.println(st.get(3));
	     System.out.println("-------get and set---------");
	     st.set(1, "Dates");
	     for(String s:st) {
              System.out.println(s);
	     }
	}

}
