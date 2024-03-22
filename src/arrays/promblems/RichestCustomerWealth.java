package arrays.promblems;

import java.util.Scanner;

/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/ 


public class RichestCustomerWealth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Prompt the user to enter the number of customers and banks
		System.out.println("Enter the number of customers: ");
		int numCustomer =sc.nextInt();
		
		System.out.println("Enter the number of customers: ");
		int numBank = sc.nextInt();
		
		// Create the accounts array based on user input
		int[][] accounts = new int[numCustomer][numBank];
		
        // Prompt the user to enter the account balances for each customer and bank
		for(int i =0; i < numCustomer; i++)
		{
			 
			for(int j = 0; j < numBank; j++)
			{
                System.out.println("Enter the balance for customer " + (i+1) + " and bank " + (j+1) + ": ");
				accounts[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("2d array: ");
		  for(int[] arr : accounts)
		  { 
		    for(int num : arr) 
		    { 
			  System.out.println(num+" ");
		    }
		  }
		 
		  int result = toPrintMaximumWealth(numBank, numBank, accounts);
		  System.out.println("Maximum wealth: "+result);
	}

	private static int toPrintMaximumWealth(int numBank,int numCustomer,int[][] accounts) {
		// TODO Auto-generated method stub
		int maxWealth = 0;
	for(int[] customerabalance : accounts)
	{
		int wealth = 0;
		
		for(int accountBalance : customerabalance)
		{
			wealth += accountBalance;
		}
		maxWealth = Math.max(maxWealth, wealth);
	}
	return maxWealth;
	}
	
	
	
	/*
	 * Function maxWealth(accounts): Initialize maxWealth = 0
	 * 
	 * For each customer in accounts: Initialize wealth = 0 For each bank account in
	 * customer: Add the amount of money in the bank account to wealth Update
	 * maxWealth if wealth is greater than maxWealth
	 * 
	 * Return maxWealth
	 */

}
