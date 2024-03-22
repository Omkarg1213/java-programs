package arrays.promblems;

import java.util.Scanner;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.*/
/*
Function runningSum(nums):
    Let n be the length of nums
    Create an array runningSum of size n
    
    Set runningSum[0] to nums[0]
    
    For i from 1 to n-1:
        Set runningSum[i] to runningSum[i-1] + nums[i]
        
    Return runningSum
*/

public class RunningSumOf1dArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length of your array: ");
	int n = sc.nextInt();
	
	int[] nums = new int[n];
	
	System.out.printf("Enter the %d numbers: ",n);
	
	for(int i = 0; i < n; i++)
	{
		nums[i] = sc.nextInt();
	}
	
	System.out.print("Original Array: ");
	toPrintOriginalArray(nums);
	
	System.out.print("Running Sum of 1D array: [");
	toRunningSumOf1dArray(n,nums);
}

private static void toRunningSumOf1dArray(int n, int[] nums) {
	// TODO Auto-generated method stub
	int[] runningSum = new int[n];
	runningSum[0] = nums[0];
	
	for(int i=1; i < n; i++)
	{
		runningSum[i] = runningSum[i-1] + nums[i];
		System.out.print(runningSum[i]);
		
		  if(i < n-1) { System.out.print(","); }
		 
	}
	System.out.println("]");
}

private static void toPrintOriginalArray(int[] nums) {
	// TODO Auto-generated method stub
	for(int arr : nums)
	{
		System.out.print(arr + " ");
	}
	System.out.println();
}
}
