package controlstatements.programs;

import java.util.Scanner;

//Perimeter Of Circle
//Perimeter Of Equilateral Triangle
//Perimeter Of Parallelogram
//Perimeter Of Rectangle
//Perimeter Of Square
//Perimeter Of Rhombus
public class PerimeterOfGivenShape {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	boolean flag = true;

	while(true)
	{
		System.out.println("Please mention the shape in the given below options that you would like to know the perimeter of the same: ");
		String shape = sc.nextLine().toLowerCase();	
		
		switch(shape)
		{
		case "circle":
		{
			System.out.println("Please enter the radius of the Circle: ");
			int radius = sc.nextInt();
			double Area = toFindPerimeterOfTheCircle(radius);
			System.out.printf("Area of the Circle is %.2f\n",Area);
			break;
		}
		case "parallelogram":
		{
			System.out.println("Enter the length of one pair of opposite sides (a): ");
			int a_length = sc.nextInt();
			System.out.println("Enter the length of other pair of opposite sides (b): ");
			int b_length = sc.nextInt();
			int Area = toFindPerimeterOfTheParallelogram(a_length,b_length);
			System.out.printf("Area of the Parallelogram is %d\n",Area);
			break;
		}
		case "rectangle":
		{
			System.out.println("Enter the length of one pair of opposite sides (a): ");
			int a_length = sc.nextInt();
			System.out.println("Enter the length of other pair of opposite sides (b): ");
			int b_length = sc.nextInt();
			int Area = toFindPerimeterOfTheRectangle(a_length,b_length);
			System.out.printf("Area of the Rectangle is %d\n",Area);
			break;
		}
		case "square":
		{
			System.out.println("Enter the length of ant one side: ");
			int a_length = sc.nextInt();
			int Area = toFindPerimeterOfTheSquare(a_length);
			System.out.printf("Area of the Square is %d\n",Area);
			break;
		}
		case "rhombus":
		{
			System.out.println("Enter the length of ant one side: ");
			int a_length = sc.nextInt();
			int Area = toFindPerimeterOfTheRhombus(a_length);
			System.out.printf("Area of the Rhombus is %d\n",Area);
			break;
		}
		case "equilateral triangle":
		{
			System.out.println("Enter the length of ant one side: ");
			int a_length = sc.nextInt();
			int Area = toFindPerimeterOfTheEquilateralTriangle(a_length);
			System.out.printf("Area of the Equilateral Triangle is %d\n",Area);
			break;
		}
		default :
		{
			System.out.println("Please enter the valid option.");
			break;
		}
		}
		
	    System.out.println("Do you want to calculate the area for another shape? (yes/no)");

		String toContinue = sc.next().toLowerCase();
			if(!toContinue.contains("yes"))
			{
				System.out.println("TaTa...Bye,,,Byee...Khatam!");
				sc.close();
				System.exit(0);
			}
	}
}

private static double toFindPerimeterOfTheCircle(int radius) {
	// TODO Auto-generated method stub
	return 2*3.14*radius;
}

private static int toFindPerimeterOfTheParallelogram(int a_length, int b_length) {
	// TODO Auto-generated method stub
	return 2 * (a_length + b_length);
}

private static int toFindPerimeterOfTheRectangle(int a_length, int b_length) {
	// TODO Auto-generated method stub
	return 2 * (a_length + b_length);
}

private static int toFindPerimeterOfTheSquare(int a_length) {
	// TODO Auto-generated method stub
	return 4*a_length;
}

private static int toFindPerimeterOfTheRhombus(int a_length) {
	// TODO Auto-generated method stub
	return 4*a_length;
}

private static int toFindPerimeterOfTheEquilateralTriangle(int a_length) {
	// TODO Auto-generated method stub
	return 3*a_length;
}
}
