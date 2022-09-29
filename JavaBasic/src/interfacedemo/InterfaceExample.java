package interfacedemo;

interface Test {

	int a = 20;

	void dispaly();

}

public class InterfaceExample implements Test

{

	public void display() {

		System.out.println(a);

	}

	public static void main(String[] args) {
		

		InterfaceExample t = new InterfaceExample();
		t.dispaly();

	}

}