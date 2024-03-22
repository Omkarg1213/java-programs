package Day4;

import java.util.*;

public class Day8 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist  
		
		list.add("Omkar G"); //Creating arraylist  
		list.add("Jyotsana");
		list.add("Praveen");
		list.add("Shubha");
		list.add("Rahul");
		list.add("Razi");
		list.add("Omkar G");
		
		System.out.println(list);   //Creating arraylist    
		
		  //Traversing list through Iterator 
		
		Iterator itr=list.iterator();//getting the Iterator
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.hasNext()); 
		 }
	}

}
