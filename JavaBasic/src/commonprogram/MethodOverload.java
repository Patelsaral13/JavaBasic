package commonprogram;

public class MethodOverload {
	int a, b;

	void sum() {

		a = 10;
		b = 10;
		System.out.println(a + b);

	}

	void sum(int x, int y) {

		System.out.println(x + y);

	}

	void sum(int x, int y, int z) {

		System.out.println(x + y + z);
	}

	void sum(double x, double y) {

		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload mo1 = new MethodOverload();
		mo1.sum();
		mo1.sum(10, 20);
		mo1.sum(10, 20, 30);
		mo1.sum(35.5, 34.5);

	}

}
