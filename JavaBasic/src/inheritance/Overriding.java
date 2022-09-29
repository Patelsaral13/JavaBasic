package inheritance;

class Bank {

	int getRateOfinterest() {

		return 0;

	}

}

class Axis extends Bank {

	int getRateofinterest() {

		return 10;

	}

}

class ICICI extends Bank {

	int getRateofinterest() {

		return 15;
	}

}

class SBI extends Bank{
	
	int getRateofInterst() {
		
		
		return 12;
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Axis ax = new Axis();
		System.out.println(ax.getRateofinterest());
		SBI sb = new SBI();
		System.out.println(sb.getRateofInterst());
		ICICI ic = new ICICI();
		System.out.println(ic.getRateofinterest());
		
		
	}

}
