package controlstatements.programs;

import java.util.Scanner;

public class ElectricityBillCalculator {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Enter the power consumed in unit: ");
		int unit = sc.nextInt();
		
		int result = calculateBill(unit);
		
		 System.out.println("Your electicity bill is: "+result);
	}
}

private static int calculateBill(int unit) {
	// TODO Auto-generated method stub
	if(unit <= 100)
		return unit * 10;
	
	else if (unit <= 200)
		return (100 * 10) + (unit - 100) * 15;
	
	else if (unit <= 300)
		return (100 * 10) + (100 * 15) + (unit - 200) * 15;
	
	else if (unit > 300)
	{
		return (100 * 10) + (100 * 15)+ (100 * 20) + (unit - 300) * 25;
	}
	
	return 0;
}
}
