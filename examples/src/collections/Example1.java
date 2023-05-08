package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Spliterators;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ArrayList al=new ArrayList();
             al.add("arul");
             al.add("aruna");
             al.add("veera");
             al.add(5);
             al.add("rani");
             
             System.out.println(al);
             /*  for(Object s:al) {
                   System.out.println(s);

               } */

            Iterator i=al.iterator();
            while(i.hasNext()) {
            	if( i.next().equals(5))
                //System.out.println(i.next());
                 i.remove();
                }
             System.out.println(al);   

             
             ListIterator li=  al.listIterator();
             li.add("raja");
             while(li.hasNext()) {
            	 if(li.next().equals("aruna")) {
                  li.remove();
            	 }
                 System.out.println(li.next());
            
             }
             System.out.println(al);   

          

            


	}

}
