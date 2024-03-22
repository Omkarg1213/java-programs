package flowOfPrograms;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the numbers (enter 'x' to finish): ");
        while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sum += num;
            } else {
                String input = sc.next();
                if (input.equals("x")) {
                    System.out.println("Sum of the numbers: " + sum);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'x' to finish.");
                }
            }
        }
        sc.close();
    }
}

