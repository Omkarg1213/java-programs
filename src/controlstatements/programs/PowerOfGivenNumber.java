package controlstatements.programs;

import java.util.Scanner;

public class PowerOfGivenNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double base,exponent;
	
	System.out.print("Enter the value of Base: ");
	base = sc.nextDouble();
	
	System.out.print("Enter the value of Exponent: ");
	exponent = sc.nextDouble();
	
	double result = toiFindPowerOfGivenNumber(base,exponent);
	 System.out.print("Power of given number is: "+result);
	}

private static double toiFindPowerOfGivenNumber(double base, double exponent) {
	// TODO Auto-generated method stub
	double pow = Math.pow(base, exponent);
	return pow;
}
}
