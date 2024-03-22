package arrays.promblems;

/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/

import java.util.ArrayList;
import java.util.Scanner;

public class KidWiththeGreatestNumberOfCandies {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length of the array: ");
	int n = sc.nextInt();
	
	System.out.println("Enter the elements of the array candies: ");
	ArrayList<Integer> candies = new ArrayList<Integer>();
	
	for(int i =0; i < n; i++)
	{
		candies.add(sc.nextInt());
	}
	
	System.out.println("ArrayList of Candies: "+candies);
	
	System.out.print("Extra Candies: ");
	int ExtraCandies = sc.nextInt();
	
	ArrayList<Boolean> result = kidsWithCandies(candies,ExtraCandies);
	System.out.println(result);
}

private static ArrayList<Boolean> kidsWithCandies(ArrayList<Integer> candies, int extraCandies) {
	
	  ArrayList<Boolean> result = new ArrayList<>();
      
      // Step 2: Find the maximum number of candies among all kids
      int maxCandies = 0;
      for (int candy : candies) {
          maxCandies = Math.max(maxCandies, candy);
      }
      
      // Step 3: Iterate over each kid's candies
      for (int candy : candies) {
          // Step 3a: Check if adding extraCandies to the current kid's candies makes it equal to or greater than the maximum
          if (candy + extraCandies >= maxCandies) {
              // Step 3b: Add true to the result list
              result.add(true);
          } else {
              // Step 3c: Add false to the result list
              result.add(false);
          }
      }
      
      // Step 4: Return the result list
      return result;
}
}
