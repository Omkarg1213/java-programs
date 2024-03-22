package controlstatements.programs;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println("Enter the value of r: ");
        r = sc.nextInt();

        int result = permutation(n, r);
        int result1 = combination(n, r);
        System.out.println("Permutation: " + result);
        System.out.println("Combination: " + result1);
    }

    private static int permutation(int n, int r) {
    	if (n < 0 || r < 0 || n < r) {
            return 0; // Invalid input, return 0 for simplicity
        }
        int npr = factorial(n) / (factorial(n - r));
        return npr;
    }

    private static int combination(int n, int r) {
    	if (n < 0 || r < 0 || n < r) {
            return 0; // Invalid input, return 0 for simplicity
        }
        int ncr = factorial(n) / (factorial(n - r) * factorial(r));
        return ncr;
    }

    private static int factorial(int n) {
    int factorial = 1;
    for(int i = 1; i <= n; i++)
    {
    	factorial *= i;
    }
    return factorial;
    }
}
