package programs;

public class PalindromeString {

	public static void main(String[] args) {
		
		//Palindrome is when reversed, value should be same. Ex:- madam
		
		String str = "madam", rstr = "";
		
		for (int i=0; i<str.length(); i++) {
			
			rstr = str.charAt(i) + rstr;
			
		}
		
		if (str.equalsIgnoreCase(rstr)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is NOT Palindrome");
		}
		
	}

}
