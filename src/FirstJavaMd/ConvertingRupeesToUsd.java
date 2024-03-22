package FirstJavaMd;

import java.util.Scanner;

//Input currency in rupees and output in USD.

public class ConvertingRupeesToUsd {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
	    System.out.println("Please enter the INR need to be converted to dollar: ");
	    int INR = sc.nextInt();
	    
	    System.out.println("Please enter the exchange rate: ");
	    int exchange_rate = sc.nextInt();
		int result = convertingRupeesToUsd(INR,exchange_rate);
		System.out.println("INR in USD is: "+result);
		}
	}
	
	public static int convertingRupeesToUsd(int INR, int exchange_rate) {
		// TODO Auto-generated method stub
		int USD = INR / exchange_rate;
		return USD;
	}
}
