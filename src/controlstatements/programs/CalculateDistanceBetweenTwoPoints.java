package controlstatements.programs;

import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true)
	{
		int x1,x2,y1,y2;
		System.out.print("Enter the coordinates for the first point (x1, y1): ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		
		System.out.print("Enter the coordinates for the first point (x2, y2): ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		int result = toCalculateDistanceBetweenTwoPoints(x1,x2,y1,y2);
		System.out.printf("Distance between the (%d,%d) and (%d,%d) points: %d \n\n",x1,y1,x2,y2,result);
	}
	}

private static int toCalculateDistanceBetweenTwoPoints(int x1, int x2, int y1, int y2) {
	// TODO Auto-generated method stub
	int deltx = x2 - x1;
	int delty = y2 - y1;
	
	double result =  Math.sqrt(Math.pow(deltx, 2) - Math.pow(delty, 2));
	return (int) result;
}
}
