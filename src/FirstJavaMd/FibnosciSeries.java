package FirstJavaMd;
import java.util.Scanner;

public class FibnosciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a non-negative integer to calculate Fibonacci Series (enter -1 to exit): ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            if (num < 0) {
                System.out.println("Please enter a non-negative integer.");
                continue;
            }

            int result = fibonacciSeries(num);
            System.out.println("Fibonacci Series up to " + num + " terms: " + result);
        }

        sc.close();
    }

    private static int fibonacciSeries(int num) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return nextTerm;
    }
}

