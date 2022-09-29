package commonprogram;

import java.util.Scanner;

public class Evenoddnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int i = sc.nextInt();
		
		
		if(i%2==0)
		{
			
			System.out.println("Num is even");
			
			
		}
		else 
		
		{
		System.out.println("Num is odd");
		}
		
	}

}
