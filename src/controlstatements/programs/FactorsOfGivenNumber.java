package controlstatements.programs;

import java.util.Scanner;

public class FactorsOfGivenNumber {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Please enter the numer to find Factor of the same: ");
		int num = sc.nextInt();
		
		toFindFactor(num);
	}
}

	private static void toFindFactor(int num) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}

