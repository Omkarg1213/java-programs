package FirstJavaMd;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterst {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter the principal, time and rate: ");
			int principal = sc.nextInt();
			int interst = sc.nextInt();
			int rate = sc.nextInt();
		    int result = simpleInterst(principal,interst,rate);
		    
		    System.out.println("Simple Interst is "+result+".");
		}
	}

	private static int simpleInterst(int a,int b,int c) {
		int si = a * b * c / 100;
		return si;
	}

}
