package stringdemo;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "Welcome";
       System.out.println(str.length());
       
       String str1 = "Saral";
       String str2 = "Patel";
       
       System.out.println(str1.concat(" "+str2));
       
       System.out.println(str1.equals(str2));
       
       String str3 = "SARAL";
       
       System.out.println(str1.equalsIgnoreCase(str3));
       
       System.out.println(str1.substring(2,4));
       
       System.out.println(Count_Vowels());
       
     
	}
       
	
	public static int Count_Vowels()
       
       {
         String str4 ="Welcome";
         int c=0;
       
          for(int i=0;i<str4.length();i++)
    	   
       {
             if(str4.charAt(i)== 'a' || str4.charAt(i)=='e'|| str4.charAt(i)=='i'|| str4.charAt(i)== 'o' || str4.charAt(i)=='u')
              c++;
       
	}

       return c;
       }
}

