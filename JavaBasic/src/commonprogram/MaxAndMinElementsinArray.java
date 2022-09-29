package commonprogram;

public class MaxAndMinElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 34, 54, 67, 89 };

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];

			}

		}
		for(int i=1;i<a.length;i++) {
			
			if(a[i] < min) {
				
				min = a[i];
				
			}
			
			
		}
		System.out.println("Max number from array:" + max);
		System.out.println("Min number from array:" + min);
	}

}
