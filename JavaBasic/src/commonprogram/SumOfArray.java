package commonprogram;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 6, 7, 8, 9 };

		int sum = 0;

//		for (int i = 0; i <= a.length - 1; i++) {
//
//			sum = sum + a[i];
//
//		}
		
		for(int i:a)
			
		{
			sum = sum + i;
			
		}
		
		System.out.println("sum of the Array:" + sum);

	}

}
