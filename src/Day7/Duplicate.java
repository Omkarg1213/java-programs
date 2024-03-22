package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate {


public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(2);
	a.add(1);
	a.add(3);
	
	HashSet<Integer> set = new HashSet<Integer>();   //to store unique value
	//set.addAll(a);
	
	List<Integer> duplicate = new ArrayList<Integer>();  //to store duplicate value
	
	for(int num1 : a) //Traversing a using for each loop 
	{
		 if (!set.add(num1)) // adds the elements num1 if not present in set
		 {
             duplicate.add(num1);   //if the element is already present in Hash set it'll enter in the if block then it'll add the element in the duplicate
         }
	}
	
	System.out.println(duplicate);
	//System.out.println(set);
}
}
