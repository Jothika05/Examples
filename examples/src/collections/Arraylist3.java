package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
	     st.add("mango");
	     st.add("apple");
	     st.add("banana");
	     st.add("grapes");
      Collections.sort(st);
      System.out.println("Sorting strings are......");
      for(String s:st) {
	     System.out.println(s);
      }
         
	     System.out.println("Sorting numbers......");
	     ArrayList<Integer> li=new  ArrayList<Integer>();
	     li.add(91);
	     li.add(22);
	     li.add(53);
	     li.add(44);
	     Collections.sort(li);
      
      
	     for(Integer n:li) {
		     System.out.println(n);
	      }
      
      
      
      
      
      
      
	}

}
