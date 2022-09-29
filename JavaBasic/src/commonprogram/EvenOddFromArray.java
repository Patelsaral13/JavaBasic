package commonprogram;

public class EvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even Numbers in array:");
	
		for (int i = 0; i <= a.length-1; i++)

		{

			if (a[i] % 2 == 0)

				System.out.println(a[i]);

		}
		System.out.println("\n");
		System.out.println("Odd Numbers in array:");
	
		
		for (int i = 0; i <= a.length-1; i++)

		{

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);

			}
		}

	}

}
