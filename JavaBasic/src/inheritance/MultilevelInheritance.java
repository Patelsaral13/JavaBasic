package inheritance;

class D {

	int a, b;

	public void display() {

		System.out.println(a + b);
		System.out.println("***********");

	}

}

class E extends D {

	int x, y;

	public void show() {

		System.out.println(x + y);

	}
}

class F extends E {

		int p, q;

		public void multiplication() {

			System.out.println(p * q);

		}
	}

	public class MultilevelInheritance {

		public static void main(String[] args) {

			D aobj = new D();
			aobj.a = 100;
			aobj.b = 200;
			aobj.display();

			E bobj = new E();
			bobj.a = 35;
			bobj.b = 25;
			bobj.display();
			bobj.x = 45;
			bobj.y = 55;
			bobj.show();

			F fobj = new F();
			fobj.a = 76;
			fobj.b = 89;
			fobj.display();
			fobj.x = 12;
			fobj.y = 34;
			fobj.show();
			fobj.p = 23;
			fobj.q = 83;
			fobj.multiplication();
		}
	}

