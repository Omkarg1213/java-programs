package flowOfPrograms;

//Take a number as input and print the multiplication table for it.

import java.util.*;
public class MultiplicationTable {
	public static void main(String args[])
	{
	  System.out.println("Enter the number: ");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
      mulTable(num);
	}
	
	public static void mulTable(int num)
	{
		for(int i = 1;i <= 10; i++)
		{
		 int result = num * i;
		 System.out.println(num+"*"+i+"="+result);
		}
	}

}
