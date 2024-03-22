package Day8;

import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Omkar");//Adding object in arraylist    
  list.add("Jyotsana");    
  list.add("Rahul");    
  list.add("Razi");   
  list.add("Praveen");    
  list.add("Sathyam");    
  list.add("Shubha"); 
  
  System.out.println("List:"+list+"\n");
  System.out.println("List after iteration:"+"\n");
  
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
   while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
   System.out.println();
   
   System.out.println("List after for ech loop iteration:"+"\n");
   for(String names : list)
   {
	   System.out.println(names);
   }
   System.out.println();
   
   System.out.println("Returning element: "+list.get(1)+"\n");//it will return the 2nd element, because index starts from 0  
   
   list.set(1,"Akshay"); 
   
 //Traversing list through Iterator  
   Iterator itr1=list.iterator();//getting the Iterator  
    while(itr1.hasNext()){//check if iterator has the elements  
    System.out.println(itr1.next());//printing the element and move to next  
   }
   System.out.println();
   
   //Sorting the list  
   Collections.sort(list); 
   
   System.out.println("Traversing list through List Iterator:\n");  
   //Here, element iterates in reverse order  
      ListIterator<String> list1=list.listIterator(list.size());  

      while(list1.hasPrevious())  
      {  
          String str=list1.previous();  
          System.out.println(str);  
      }  
      
      System.out.println("Traversing list through for loop:\n");  
      for(int i=0;i<list.size();i++)  
      {  
       System.out.println(list.get(i));     
      } 
      
      System.out.println("Traversing list through forEach() method:");  
      //The forEach() method is a new feature, introduced in Java 8.  
          list.forEach(a->{ //Here, we are using lambda expression  
              System.out.println(a);  
            });
 }  
} 
