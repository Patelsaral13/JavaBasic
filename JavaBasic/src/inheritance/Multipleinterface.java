package inheritance;

interface P {

	int a = 10;

	void display();

}

interface Q {

	int b = 20;

	void show();

}

public class Multipleinterface implements P, Q {

	public void display() {

		System.out.println(a);

	}

	public void show() {

		System.out.println(b);
	}

	public static void main(String[] args) {

		Multipleinterface mi = new Multipleinterface();
		mi.display();
		mi.show();

	}

}
