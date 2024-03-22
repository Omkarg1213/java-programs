package controlstatements.programs;
////Prompt user for input
//PRINT "Enter the original price of the product: "
//originalPrice = GET_INPUT()
//
////Assume no discount initially
//discount = 0
//
////Check conditions for discount
//IF originalPrice >= 100  // Example condition: If the original price is $100 or more
// discount = 10  // Apply a 10% discount for purchases of $100 or more
//ELSE IF originalPrice >= 50  // Example condition: If the original price is $50 or more
// discount = 5  // Apply a 5% discount for purchases between $50 and $99.99
//END IF
//
////Calculate discounted price
//discountedPrice = originalPrice - (originalPrice * (discount / 100))
//
////Display results
//PRINT "Original Price: $" + originalPrice
//PRINT "Discount: " + discount + "%"
//PRINT "Discounted Price: $" + discountedPrice

import java.util.Scanner;

public class CalculateDiscountPrice {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 while(true)
 {  
	  System.out.println("Please enter the Original Price: ");
	  double original_price = sc.nextDouble();
	  
	 int result =  toFindDiscount(original_price);
	 
	 System.out.println("Discouinted price is:"+result);
 }
}

private static int toFindDiscount(double original_price) {
	int discount = 0;
	
	if(original_price < 100)
	{
		discount = 0;
	}
	else if(original_price > 100)
	{
		discount = 5;
	}
	else if(original_price > 200)
	{
		discount = 10;
	}
	else if(original_price > 300)
	{
		discount = 15;
	}
	else if(original_price > 400)
	{
		discount = 20;
	}
	
	int discountedPrice = (int) (original_price - (original_price * (discount / 100)));
	return discountedPrice;
}
}
