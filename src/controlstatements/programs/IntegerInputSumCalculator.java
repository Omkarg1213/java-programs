package controlstatements.programs;

import java.util.Scanner;

public class IntegerInputSumCalculator {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = 0;

        do {
            System.out.println("Please insert a number: ");
            x = in.nextInt();

            // If x is 0 it wont change the sum
            sum += x;
            System.out.println(sum);

        } while (x > 0);

        System.out.println("no data was entered");

    }
}

