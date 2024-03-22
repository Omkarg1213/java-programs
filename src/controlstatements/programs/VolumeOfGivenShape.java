package controlstatements.programs;

import java.util.Scanner;

//Volume Of Prism
//Volume Of Cylinder
//Volume Of Sphere
//Volume Of Pyramid
public class VolumeOfGivenShape {
public static void main(String[] args) {
	
	volumeOfPrism();
	volumeOfCylinder();
	volumeOfSphere();
	
}

private static void volumeOfPrism() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the value of length, breadth and height: ");
	int length = sc.nextInt();
	int breadth = sc.nextInt();
	int height = sc.nextInt();
	
	int volumeOfPrism = length * breadth * height; 
	
	System.out.println("The volume of the Prism is "+ volumeOfPrism);
}

private static void volumeOfCylinder() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the value of radius of base and height: ");
	int radius = sc.nextInt();
	int height = sc.nextInt();
	
	double volumeOfCylinder = 3.14 * Math.pow(radius, 2) * height; 
	
	System.out.println("The volume of the Prism is "+ volumeOfCylinder);
}

private static void volumeOfSphere() {
	// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the value of radius of base and height: ");
	int radius = sc.nextInt();
	
	double volumeOfSphere = (4/3) * Math.pow(radius, 3); 
	
	System.out.println("The volume of the Prism is "+ volumeOfSphere);
}
}
