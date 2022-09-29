package commonprogram;

import java.util.Scanner;

public class CountSumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");

		int num = sc.nextInt();

		int count_sum = 0;

		while (num > 0) {
			int rem = num % 10;
             
			count_sum = rem + count_sum;
			num=num/10;

		}
        
		
		System.out.println("Sum of the num: " + count_sum);

	}

}
