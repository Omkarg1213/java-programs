package controlstatements.programs;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    while(true)
    {
    	 System.out.println("Enter a alphabet to check vowel or consonant:");
         char userInput = sc.next().charAt(0);
         
         if (isVowel(userInput)) {
             System.out.println(userInput + " is a vowel.");
         } else {
             System.out.println(userInput + " is not a vowel.");
         }
    }
	}

	private static boolean isVowel(char alphabet) {
		// TODO Auto-generated method stub
		 // Define a set of vowels
        String vowels = "aeiouAEIOU";

        // Check if the character is a vowel
        return vowels.indexOf(alphabet) != -1;
	}

}
