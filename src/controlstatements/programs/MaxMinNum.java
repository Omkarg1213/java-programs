package controlstatements.programs;

import java.util.Scanner;

public class MaxMinNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	
		System.out.printf("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int result = min(a,b,c);
		int result1 = max(a,b,c);
		System.out.printf("Minimum among %d, %d and %d is %d \n",a,b,c,result);
		System.out.printf("Maximum among %d, %d and %d is %d \n",a,b,c,result1);

}

private static int max(int a, int b, int c) {
	// TODO Auto-generated method stub
	if((a > b) && (a > c))
	{
		return a;
	}
	else if((b > a) && (b > c))
	{
		return b;
	}
	else
	{
		return c;
	}
}

private static int min(int a, int b, int c) {
	// TODO Auto-generated method stub
	if((a < b) && (a < c))
	{
		return a;
	}
	else if((b < a) && (b < c))
	{
		return b;
	}
	else
	{
		return c;
	}
}
}
