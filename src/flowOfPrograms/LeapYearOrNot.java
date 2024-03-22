package flowOfPrograms;

//Input a year and find whether it is a leap year or not.

import java.util.*;
public class LeapYearOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.print("Enter the Year: ");
		int year = sc.nextInt();
		
		isLeapYear(year);
		}
	}
	
	public static void isLeapYear(int year)
	{
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println(year + " is a Leap year");
		}
		else 
		{
			System.out.println(year+" is not a leap year");
		}
	}  
}
