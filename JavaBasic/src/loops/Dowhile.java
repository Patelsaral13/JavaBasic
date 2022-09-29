package loops;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number you want multiplication table-");
		int k = sc.nextInt();
		int i = 1;
		 

		do {
			
			System.out.println(i*k);
		    i++;
		    

		} while (i <= 10);

	}

}
