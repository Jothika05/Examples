package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> st=new ArrayList<String>();
	     st.add("Ravi");
	     st.add("Vijay");
	     st.add("Ravi");
	     st.add("Ajay");

	     System.out.println("Traversting list through List iterator");
	     ListIterator<String> li=st.listIterator();
	     li.next();
	     while(li.hasPrevious()) {
	        String s=li.previous();
	    	 System.out.println(s);
	     }
         System.out.println("-------------------");

	     
	     System.out.println("Travertsing list through for  loop");
	     for(int i=0;i<st.size();i++) {
	    	 System.out.println(st.get(i));
	    	 }
	     System.out.println("-------------------");
	     
	     System.out.println("Traversting  list through foreachloop");
	     for(String s:st) {
	    	  System.out.println(s);
	     }
	     System.out.println("-------------------");
	     
	     
	     System.out.println("Traversting through  foreach remaining method() ");
	     Iterator<String> i=st.iterator();
	    		 i.forEachRemaining(a->{System.out.println(a);});
	     
	     System.out.println("-------------------");	
	     
	     
	      System.out.println("Traversting list through List iterator");
          ListIterator<String> l=st.listIterator();
          l.next();
          l.next();
          l.next();
         String str=l.previous();
         System.out.println(str);
          int index=l.previousIndex();
           System.out.println(index);

	}
	}


