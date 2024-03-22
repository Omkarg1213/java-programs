package FirstJavaMd;
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean flag = true;
	while(flag)
	{
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = greatest(a,b);
		System.out.println("Greatest among the given numbers is "+result);
	}
}

private static int greatest(int a, int b) {
	// TODO Auto-generated method stub
	return (a>b)?a:b;
}
}
