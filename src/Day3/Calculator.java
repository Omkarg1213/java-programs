package Day3;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the operator: ");
       Scanner sc =new Scanner(System.in);
       String operator = sc.next();
       
       System.out.println("Enter two numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       switch(operator)
       {
       case "+":
    	   System.out.println(a+b);
    	   break;
       case "-":
    	   System.out.println(a-b);
    	   break;
       case "*":
    	   System.out.println(a*b);
    	   break;
       case "/":
    	   System.out.println(a/b);
    	   break;
       default:
    	   System.out.println("Invalid entry");
    	   break;
       }
       
	}

}
