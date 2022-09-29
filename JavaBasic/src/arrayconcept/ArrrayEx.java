package arrayconcept;

public class ArrrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 101, 102, 103, 104, 105 };

		int sum = 0;

		for (int i : a)

		{

			System.out.println(i);
			sum = sum + i;
		}
	
		System.out.println(sum);

	}

}
