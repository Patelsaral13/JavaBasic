package commonprogram;

public class StaticEx {

	int a;
	static int b;

	static void m1() // static method
	{
		System.out.println("This is static method");

	}

	void m2() // non static method
	{
		System.out.println("This is non static");

	}

	public static void main(String[] args) {

		b = 100;
		System.out.println(b);
		m1();

		// a=200; //not accessible bcoz its non static
//		m2();  //not accessible bcoz its static

		StaticEx se = new StaticEx();
		se.a = 200;
		System.out.println(se.a);

	}

}
