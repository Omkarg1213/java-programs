package controlstatements.programs;

import java.util.Scanner;

public class AverageOfNnumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	while(true)
	{
		System.out.print("Please enter the number of digits for which you want to find Average: \n");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		 System.out.print("Please enter the digits to find Average: \n");
		 for(int i=0; i < N; i++)
		 {
		 arr[i] = sc.nextInt();	
		 }
		int result = toFindAverage(N,arr);
		
		System.out.printf("Average of %d is %d.\n",N,result);
    }
}

private static int toFindAverage(int n, int[] arr) {
	int sum = 0;
	int count = 0;
	
	for(int i =0; i < n; i++ )
	{
		sum += arr[i];
		count++;
	}
	
	int average = sum / count;
	return average;
}
}
