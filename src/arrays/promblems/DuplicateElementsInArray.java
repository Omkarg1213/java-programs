package arrays.promblems;

import java.util.HashSet;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		//int[] arr = {2,3,3,2,4,5,2,6,7};
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
		
		boolean isDuplicateExist = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(uniqueNumbers.contains(arr[i]))	{
				isDuplicateExist = true;
				
				System.out.println("Duplicate element : " + arr[i]);
			}
//			else {
//				System.out.println("Unique element : "+uniqueNumbers.add(arr[i])); 
//			}
		}
		
		if(!isDuplicateExist)
			System.out.println(-1);
	}
}
