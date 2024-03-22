package arrays.promblems;

import java.util.Scanner;

/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/

/*pseudo code:
	
	Function buildArray(nums):
	    Let n be the length of nums   // We create an array ans of the same length as nums.
	    Create an array ans of size n  // We iterate over each index i from 0 to n-1, where n is the length of nums.
	    
	    For i from 0 to n-1:         // For each index i, we set ans[i] to nums[nums[i]].
	        Set ans[i] to nums[nums[i]]
	        
	    Return ans     //Finally, we return the ans array.
*/

public class PermutationArray {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the length of the array: ");
	 int n = sc.nextInt();
	 int[] nums = new int[n];
	
	 System.out.printf("Enter the %d integers: ",n);
	 for(int i=0; i <= n-1;i++)
	 {
		 nums[i] = sc.nextInt();
	 }
	 
	 System.out.print("Original array: \n");
	 toPrintOriginalArray(nums);
	 
	 System.out.print("Permutation array: [");
	 toPrintPermutationArray(nums);
}

private static void toPrintOriginalArray(int[] nums) {
	// TODO Auto-generated method stub
	/*
	 * for(int i=0; i <= n-1; i++) { System.out.print(nums[i]+" "); }
	 * 
	 * System.out.println();
	 */
	 
	 for(int arr :nums)
	 {
		 System.out.print(arr+" ");
	 }
	
}

private static void toPrintPermutationArray(int[] nums) {
	// TODO Auto-generated method stub
	int n = nums.length-1;
	int[] ans = new int[n];
	
	 for (int i = 0; i < n; i++) {
         System.out.print(nums[i]);
         if (i < n - 1) {
             System.out.print(",");
         }
     }
     System.out.println("]");
}

}
