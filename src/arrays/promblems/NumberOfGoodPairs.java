package arrays.promblems;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfGoodPairs {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of the ArrayList:");
	int n = sc.nextInt();
	
	ArrayList<Integer> nums = new ArrayList<Integer>(n);
	
	System.out.print("Enter the numbers to be checked for good pair in ArrayList nums:");
	
	for(int i = 0; i < n; i++)
	{
		nums.add(sc.nextInt());
	}
	
	System.out.println("ArrayList nums"+nums);
	
	int result = goodPairs(nums.toArray(new Integer[0]));
	System.out.println(result);
}

private static int goodPairs(Integer[] integers) {
	// TODO Auto-generated method stub
    // Array to store the count of occurrences of each number
    int[] count = new int[101]; // Since the constraint is nums[i] <= 100

    // Count occurrences of each number
    for (int num : integers) {
        count[num]++;
    }
    // Initialize total count of good pairs
    int goodPairs = 0;

    // Calculate the number of good pairs for each number
    for (int i = 0; i <= 100; i++) {
        if (count[i] > 1) {
            // If the number occurs more than once, calculate good pairs
            goodPairs += count[i] * (count[i] - 1) / 2;      //the number of good pairs that can be formed using the formula: n * (n - 1) / 2, 
                                                             //where n is the number of occurrences of that number
        }
    }

    return goodPairs;
}
}

