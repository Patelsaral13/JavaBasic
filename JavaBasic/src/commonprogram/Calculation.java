package commonprogram;

public class Calculation {

	int a, b;

	void sum() {

		System.out.println("Sum of a and b is : " + (a + b));

	}

	void mul(int x, int y) {

		System.out.println("Multiplication of x and y is : " + (x * y));

	}

	int divide() {
		
		return  (b / a);
	
        	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation cal1 = new Calculation();
		cal1.a = 100;
		cal1.b = 200;
		cal1.sum();
		cal1.mul(25, 50);
	    System.out.println(cal1.divide());

	}

}
