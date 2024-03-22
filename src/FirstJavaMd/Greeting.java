package FirstJavaMd;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("Please enter your name: ");
			String name = sc.nextLine();
			
			greeting(name);
		}

	}

	private static void greeting(String name) {
		// TODO Auto-generated method stub
		System.out.println("hi,"+" "+name+" "+"How are you doing today?");
		
	}

}
