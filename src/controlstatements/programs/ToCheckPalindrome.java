package controlstatements.programs;

import java.util.Scanner;

public class ToCheckPalindrome {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String to check Palindromic condition: ");
	String name = sc.nextLine();
	
	boolean result = isPalindrome(name);
	if(result == true)
	{
		System.out.printf("Given String %s is Palindrome.\n",name);
	}
	else
	{
		System.out.printf("Given String %s is not Palindrome.\n",name);
	}
	}

private static boolean isPalindrome(String name) {
	// TODO Auto-generated method stub
	if(!reverse(name).equalsIgnoreCase(name))
	{
		return false;
	}
	return true;
}

private static String reverse(String name) {
	// TODO Auto-generated method stub
	StringBuilder reverse = new StringBuilder();
	
	for(int i = name.length()-1; i >= 0; i--)
	{
		reverse.append(name.charAt(i));
	}
	return reverse.toString();
}
}
