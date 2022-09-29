package commonprogram;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
//		int rev = 0;
//		while(num!=0)
//		{
//			rev = rev*10 + num%10;
//			
//			num=num/10;
//			
//			
//			
//		}
		
//		Logic 2
		
//		
//		StringBuffer rev;
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println("Reverse num is:"+rev);
		
//	  Logic 3
		
		StringBuilder sbl = new StringBuilder();
		
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse Number is:"+rev);
		
		
		
	}

}
