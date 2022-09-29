package commonprogram;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Java";
		
		String[] words = str.split(" ");
		
		String reverse_string = "";
		
		for(String w:words)
			
		{
			String reverse_word="";
			
			for(int i = w.length()-1;i>=0;i--)
				
			{
				
				 reverse_word = reverse_word+w.charAt(i);
					
			}
			
			reverse_string = reverse_string + reverse_word+" ";
			
			
		}
		
		System.out.println("Reverse string is:"+reverse_string);
	}

}
