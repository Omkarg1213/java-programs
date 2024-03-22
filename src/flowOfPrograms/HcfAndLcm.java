package flowOfPrograms;

//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class HcfAndLcm 
{
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
	System.out.println("Please enter the two numbers: ");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int result1 = euclidLcm(a,b);
	System.out.println("The LCM of a and b is "+result1);
	
	int result2 = euclidHcf(a,b);
	System.out.println("The HCF of a and b is "+result2);
	}
}

private static int euclidLcm(int a, int b) {
	int hcf = euclidHcf(a,b);
	int lcm = a*b/ hcf;
	return lcm;
}

private static int euclidHcf(int a, int b) {
	while(a != b)
	{
		if(a > b)
		{
			a = a - b;
		}
		else
		{
			b = b - a;
		}
	}
	return a;
}

}
