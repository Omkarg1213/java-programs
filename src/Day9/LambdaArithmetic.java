package Day9;

interface ArithmeticOperation {
    int operate(int a, int b);
   // default void concat(String s1, String s2);
    
}

public class LambdaArithmetic {
    public static void main(String[] args) {
        // Modulus operation
        ArithmeticOperation modulus = (a, b) -> a % b;
        System.out.println("Modulus of 10 and 3: " + modulus.operate(10, 3));

        // Addition operation
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println("Addition of 5 and 7: " + addition.operate(5, 7));

        // Subtraction operation
        ArithmeticOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction of 10 and 3: " + subtraction.operate(10, 3));

        // Multiplication operation
        ArithmeticOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication of 4 and 6: " + multiplication.operate(4, 6));

        // Division operation
        ArithmeticOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        };
        System.out.println("Division of 10 by 2: " + division.operate(10, 2));
        
        //Concat of two Strings
        ArithmeticOperation concat = (s1,s2) -> s1+s2;
        System.out.println("Concat two Strings"+"Omkar"+".G");
        
        
    }
}
