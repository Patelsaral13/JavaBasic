package commonprogram;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String:");

		String str = sc.next();

		String org_str = str;

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--)

		{
			rev = rev + str.charAt(i);

		}
		

	

		if (org_str.equals(rev))

		{

			System.out.println("string is Palindrome");

		}
		else
		{
		System.out.println("string is not Palindrome");
		}
	}

}
