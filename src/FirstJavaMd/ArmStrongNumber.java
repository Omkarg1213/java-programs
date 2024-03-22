package FirstJavaMd;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the digits to check Armstrong condition (enter -1 to exit):");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            boolean result = isArmStrong(num);

            if (result) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }

        sc.close();
    }

    private static boolean isArmStrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = countDigits(originalNum);

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    private static int countDigits(int originalNum) {
        int countOfDigits = 0;
        while (originalNum > 0) {
            originalNum /= 10;
            countOfDigits++;
        }
        return countOfDigits;
    }
}

