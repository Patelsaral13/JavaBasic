package commonprogram;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 2, 6, 4 };
		int a2[] = { 1, 2, 3, 4 };

		boolean status = Arrays.equals(a1, a2);

		if (status == true)
			System.out.println("Both array is Equal");

		else
			System.out.println("Both array is not Equal");
	}

}
