package controlstatements.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Enter the String name to reverse: ");
	String name = sc.nextLine();
	
	String r_name = toReverse(name);
	System.out.printf("Reversed String of %s is: %s.",name,r_name);
	}

	private static String toReverse(String name) {
		// TODO Auto-generated method stub
		  // Create a StringBuilder to efficiently build the reversed string
        StringBuilder reversed = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }

        // Convert the StringBuilder to a String and return
        return reversed.toString();
	}

}
