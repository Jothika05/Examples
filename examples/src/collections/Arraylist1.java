package collections;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.ListIterator;

	public class Arraylist1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     ArrayList<String> st=new ArrayList<String>();
	     st.add("mango");
	     st.add("apple");
	     st.add("banana");
	     st.add("grapes");

	     System.out.println(st);
	     
	     System.out.println("--------------Using for each loop------------------"); 
	     
	     for(String s:st) {
		     System.out.println(s);

	   }
	     System.out.println("-----------using Iterator---------------------"); 
	     Iterator i= st.iterator();
	        while(i.hasNext()) {
		    System.out.println(i.next());
		    }
	   System.out.println("-----------using listIterator---------------------");
	   ListIterator li=st.listIterator();
	   li.next();
	   li.next();
	   li.next();
	   li.next();
	   while(li.hasPrevious()) {
		   System.out.println(li.previous());
	   } 
	   
	   
	   
	   
	   /*
	   
	   System.out.println("-----------using listIterator---------------------");
	   ListIterator l1=st.listIterator();
	   while( l1.hasNext()) {
		   if(l1.next().equals("mango")) {
			   l1.set("raaaja");
		   }
		   
	   } 
	   System.out.println(l1.next());  */
	  
		}

	}

