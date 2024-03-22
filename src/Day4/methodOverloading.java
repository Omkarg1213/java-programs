package Day4;

public class methodOverloading {
public static void main(String[] args) {
	
	int result1 = add(2,2);
	float result2 = add(2,2.2f);
	float result3 = add(2.2f,2.2f);
	double result4 = add(2.222,2);
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	int result15 = sub(2,2);
	float result6 = sub(2,2.2f);
	float result7 = sub(2.2f,2.2f);
	double result8 = sub(2.222,2);
	
	System.out.println(result15);
	System.out.println(result6);
	System.out.println(result7);
	System.out.println(result8);
}

//for addition

private static int add(int i, int j) {
	
	return i + j;
}
private static float add(int i, float j) {
	
	return i + j;
}

private static float add(float i, float j) {
	
	return i + j;
}

private static double add(double i, int j) {
	
	return i + j;
}

//for subtraction
private static int sub(int i, int j) {
	
	return i - j;
}
private static float sub(int i, float j) {
	
	return i - j;
}

private static float sub(float i, float j) {
	
	return i - j;
}

private static double sub(double i, int j) {
	
	return i - j;
}

//for multiplication

private static int mul(int i, int j) {
	
	return i * j;
}
private static float mul(int i, float j) {
	
	return i * j;
}

private static float mul(float i, float j) {
	
	return i * j;
}

private static double mul(double i, int j) {
	
	return i * j;
}

//for division

private static int div(int i, int j) {
	
	return i / j;
}
private static float div(int i, float j) {
	
	return i / j;
}

private static float div(float i, float j) {
	
	return i / j;
}

private static double div(double i, int j) {
	
	return i / j;
}

//to get reminder

private static int modulus(int i, int j) {
	
	return i % j;
}
private static float modulus(int i, float j) {
	
	return i % j;
}

private static float modulus(float i, float j) {
	
	return i % j;
}

private static double modulus(double i, int j) {
	
	return i % j;
}
}
