package flowOfPrograms;

//Take two numbers and print the sum of both.

import java.util.*; // to use Scanner class
public class SumOfNumbers 
{
  public static void main(String args[])
  {
	  System.out.println("Please enter the two numbers: ");
	  //step 1 create the object for scanner class
	  Scanner sc = new Scanner(System.in); //
	  int a = sc.nextInt(); //use nextInt method to give user input
	  int b = sc.nextInt(); //use nextInt method to give user input
	  
	  int result = sum(a,b);
	  
	  System.out.println("Sum of two numbers is "+result);
  }
  
  public static int sum(int a, int b)
  {
	  int sum = a + b;
	  return sum;
  }
}
