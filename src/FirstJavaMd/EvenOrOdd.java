package FirstJavaMd;

//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean flag = true;
	while(flag)
	{
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		isEven(a);
	}
	sc.close();
	System.out.println("Thank you for choosing us.");
}

private static void isEven(int a) {
	if(a % 2 == 0)
	{
		System.out.println("Entered number is Even.");
	}
	else
	{
		System.out.println("Entered number is Odd.");
	}
}
}
