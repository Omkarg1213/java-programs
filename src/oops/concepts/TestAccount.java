package oops.concepts;

import java.util.Scanner;

public class TestAccount {
public static void main(String[] args) {
	Account ac1 = new Account();
	
	ac1.insert(123, "Rahulla", 15000);
	
	ac1.deposit(10000);
	
	ac1.withdraw(5000);
	
	ac1.checkBalance();
	
	ac1.display();
}
}
