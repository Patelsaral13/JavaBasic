package commonprogram;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
	    int c;
		
		System.out.println("Before swapping value of a is "+a);
		System.out.println("Before swapping value of b is "+b);
	
//		Logic 1
//		c = a;
//		a = b;
//		b = c;
		
		
//		Logic 2
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		Logic 3
		
//		a = a*b;
//		b = a/b;
//		a = a/b;
		
		
//		Logic 4
//		a = a^b; //10,20 = 30
//		b=  a^b;  //30,20 = 10
//		a=  a^b;  //30,10 = 20
	
//		Logic 5
		b=a+b-(a=b);
		
		
		System.out.println("After swapping value of a is "+a);
		System.out.println("After swapping value of b is "+b);
		
		
		
		
		
	}

}
