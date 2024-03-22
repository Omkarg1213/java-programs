package Day8;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Five");

        // Printing elements of set
        System.out.println("Set: " + set);
        
		
		  java.util.Iterator<String> itr = set.iterator();
		  
		  while(itr.hasNext()) 
		  {
			  System.out.println(itr.next());
		  }
		  
		  //Removing specific element from HashSet  
          set.remove("Five");  
          System.out.println("After invoking remove(object) method: "+set);  
          
          set.addAll(set1);  
          System.out.println("Updated List: "+set); 
         
         //Removing all the new elements from HashSet  
         set.removeAll(set1);  
         System.out.println("After invoking removeAll() method: "+set);  
         
         //Removing all the elements available in the set  
         set.clear();  
         System.out.println("After invoking clear() method: "+set);  
         
         
			/*
			 * ArrayList<String> list=new ArrayList<String>(); list.add("Ravi");
			 * list.add("Vijay"); list.add("Ajay");
			 */ 
         TestStudent s1 = new TestStudent();

         ArrayList list = s1.getStudentList();
         HashSet set3 = new HashSet(list);
         
        System.out.println(set3);
         

		
    }
}

