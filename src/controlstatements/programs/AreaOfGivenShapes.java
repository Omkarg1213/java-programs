package controlstatements.programs;

import java.awt.Shape;
import java.util.Scanner;

public class AreaOfGivenShapes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	
	while(true)
	{
		System.out.println("Please name the Shape for which you would like to find area: ");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		System.out.println("3.Rectangle");
		System.out.println("4.Rhombus");
		System.out.println("5.Tringle");
		System.out.println("6.Isosceles Triangle");
		System.out.println("7.Paralellogram");
		
        String shape = sc.nextLine().toLowerCase();

		switch(shape)
		{
		case "circle":
		{
			/*
			 * System.out.print("Please enter the radis of the Circle:"); int radius =
			 * sc.nextInt();
			 */
			double circle = areaOfCircle();
			System.out.println("Area of the Circle is: "+circle+".");
			break;
		}
		case "square":
		{
			
			/*
			 * System.out.print("Please enter the side length of the Square:"); int
			 * side_length = sc.nextInt();
			 */
			 
			  int square = areaOfSquare();
			 
			System.out.println("Area of the Square is: "+square+".");
			break;
		}
		case "rectangle":
		{
			/*
			 * System.out.print("Please enter the side length and breadth of the Rectangle:"
			 * ); int side_length = sc.nextInt(); int side_breadth = sc.nextInt();
			 */
			int rectangle = areaOfRectangle();
			System.out.println("Area of the Rectangle is: "+rectangle+".");
			break;
		}
		case "rhombus":
		{
			/*
			 * System.out.print("Please enter the diagonals of the Rhombus:"); int
			 * diagonal1_length = sc.nextInt(); int diagonal2_length = sc.nextInt();
			 */
			int rhombus = areaOfRhombus();
			System.out.println("Area of the Rectangle is: "+rhombus+".");
			break;
		}
		case "triangle":
		{
			/*
			 * System.out.print("Please enter the height and base length of the Triangle:");
			 * int height = sc.nextInt(); int base = sc.nextInt();
			 */
			int triangle = areaOfTriangle();
			System.out.println("Area of the Rectangle is: "+triangle+".");
			break;
		}
		case "isosceles triangle":
		{
			/*
			 * System.out.print("Please enter the height and base length of the Triangle:");
			 * int height = sc.nextInt(); int base = sc.nextInt();
			 */
			int isoscelesTriangle = areaOfIsoscelesTriangle();
			System.out.println("Area of the Isosceles Triangle is: "+isoscelesTriangle+".");
			break;
		}
		case "parallelogram":
		{
			/*
			 * System.out.
			 * print("Please enter the height and base length of the Parallelogram:"); int
			 * height = sc.nextInt(); int base = sc.nextInt();
			 */
			int parallelogram = areaOfParallelogram();
			System.out.println("Area of the Rectangle is: "+parallelogram+".");

			break;
		}
	
		default:
		{
			System.out.println("Sorry, we are working on your need. Please select only available options.");
			flag = false;
			break;}
		}
	}

		//continuousChoise();
	/*
	 * System.out.
	 * println("Do you want to calculate the area for another shape? (yes/no)");
	 * String continuous_choise = sc.next().toLowerCase();
	 * 
	 * if(!continuous_choise.contains("yes")) {
	 * System.out.println("Tata...Bye...Bye...Khatam!!!"); sc.close();
	 * System.exit(0); }
	 */
	 	 
	}


private static void continuousChoise() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you want to calculate the area for another shape? (yes/no)");
	String continuous_choise = sc.next().toLowerCase();
	  
    if(!continuous_choise.contains("yes")) {
	  System.out.println("Tata...Bye...Bye...Khatam!!!"); 
	 
	  System.exit(0); }
}

private static double areaOfCircle() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int pi = 22/7;
	System.out.print("Please enter the radis of the Circle:");
    int radius = sc.nextInt();
	double areaOfCircle =  pi * Math.pow(radius,2);
	return areaOfCircle;
}

private static int areaOfSquare() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the side length of the Square:"); 
	int side_length = sc.nextInt();
	double A = Math.pow(side_length, 2);
	int areaOfSquare = (int) A;
	return areaOfSquare;
}

public static int areaOfRectangle() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the side length and breadth of the Rectangle:");
	int side_length = sc.nextInt();
	int side_breadth = sc.nextInt();
	return side_length * side_breadth;
}

private static int areaOfRhombus() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the diagonals of the Rhombus:");
	int diagonal1_length = sc.nextInt();
	int diagonal2_length = sc.nextInt();
	return (diagonal1_length * diagonal2_length) / 2;
	
} 

private static int areaOfTriangle() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the height and base length of the Triangle:");
	int height = sc.nextInt();
	int base = sc.nextInt();
	return 1/2 *(height * base);
}

private static int areaOfIsoscelesTriangle() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	System.out.print("Please enter the height and base length of the Triangle:");
	int height = sc.nextInt();
	int base = sc.nextInt();
	double A = 1/4 * (Math.sqrt(Math.pow(height, 2))- Math.pow(base, 2));
	int areaOfIsoscelesTriangle = (int) A;
	return areaOfIsoscelesTriangle;
}

private static int areaOfParallelogram() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the height and base length of the Parallelogram:");
	int height = sc.nextInt();
	int base = sc.nextInt();

	return base*height;
}
}