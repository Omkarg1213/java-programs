package controlstatements.programs;

import java.util.Scanner;

public class CommissionPercentage {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.out.print("Enter the total sales amount: ");
	double sales_amount =  sc.nextDouble();
	
	System.out.print("Enter the commission amount: ");
	double commission_amount =  sc.nextDouble();
	
	int result = toFindCommissionPercentage(sales_amount,commission_amount);
	System.out.printf("Commission Percentage: %d\n\n",result);
	}
	}

private static int toFindCommissionPercentage(double sales_amount, double commission_amount) {
	// TODO Auto-generated method stub
	double commission_percentage = (sales_amount / commission_amount) * 100;
	return (int)commission_percentage;
}
}
