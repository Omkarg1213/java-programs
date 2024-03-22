package FirstJavaMd;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	
	while(flag)
	{
		System.out.println("Please enter the String:");
		String name = sc.next();
		boolean flag1 = isPalindrome(name);
		
		if(flag1 == true)
		{
			System.out.println(name+" is palindrome.");
		}
		else
		{
			System.out.println(name+" is not palindrome.");
		}
	}
}

private static boolean isPalindrome(String name) {
	// TODO Auto-generated method stub
	int start = 0;
	int end = name.length()-1;
	
	while(start < end)
	{
		if(name.charAt(start) != name.charAt(end))
		{
			return false;
		}
			start++;
			end--;
		}
	return true;

}
}
