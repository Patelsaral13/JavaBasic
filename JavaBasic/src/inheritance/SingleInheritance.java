package inheritance;

class A {

	int a, b;

	public void display() {

		System.out.println(a + b);
		System.out.println("***********");

	}

}

class B extends A{

	int x, y;

	public void show() {

		System.out.println(x + y);

	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aobj = new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		
		
		B bobj = new B();
		bobj.a=35;
		bobj.b=25;
		bobj.display();
		bobj.x=45;
		bobj.y=55;
		bobj.show();
	
	}

}
