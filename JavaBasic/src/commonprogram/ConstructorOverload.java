package commonprogram;

public class ConstructorOverload {

	int a, b;
	double c;
	

	ConstructorOverload() {

		a = 10;
		b = 20;
        c=20.5;
	}

	ConstructorOverload(int a, int b) {
		this.a = a;
		this.b = b;

	}

	ConstructorOverload(int x, int y, double z) {

		
		a=x;
		b=y;
		c=z;
		
	}

	void display() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverload co = new ConstructorOverload();
		co.display();
		ConstructorOverload co1 = new ConstructorOverload(10,20);
		co1.display();
	}

}
