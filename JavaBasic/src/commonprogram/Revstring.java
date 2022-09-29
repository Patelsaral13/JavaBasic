package commonprogram;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();

//		String rev = "";

//		int len = str.length();
//		
//
//	     
//	     for(int i=len-1;i>=0;i--)
//	     {
//	    	 
//	    	 rev = rev + str.charAt(i);
//	    	 
//	     }

//		char a[] = str.toCharArray();
//		int len = a.length;
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + a[i];
//
//		}

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
//		System.out.println("Reverse string:" + rev);

	}

}
