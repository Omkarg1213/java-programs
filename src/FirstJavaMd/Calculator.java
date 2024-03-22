package FirstJavaMd;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	
	while(flag)
	{
		System.out.println("Enter the two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operator: ");
		String operator = sc.next();
		
		int result = calculator(num1,num2,operator);
		System.out.println("Your desired output is "+result);
	}
}

private static int calculator(int num1, int num2, String operator) {
	int result = 0;
	if(operator.equals("+"))
	{
	result = num1 + num2;
	}
	
	else if(operator.equals("-"))
	{
	result = num1 - num2;
	}
	
	else if(operator.equals("*"))
	{
	result = num1 * num2;
	}
	
	else if(operator.equals("/"))
	{
	result = num1 / num2;
	}
	
	else
	{
		System.out.println("Please enter the valid operator (+,-,* and /)");
	}
	return result;
}
}
