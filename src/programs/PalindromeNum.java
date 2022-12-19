package programs;

public class PalindromeNum {

	public static void main(String[] args) {
		
		//Palindrome is when reversed, value should be same. Ex:- 121. 14541
		
		int num = 14541, rnum = 0;
		
		int temp = num;
		
		while (num != 0) {
			
			rnum = rnum*10 + num % 10;
			num = num / 10;
			
		}
		
		if (temp == rnum) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is NOT Palindrome");
		}
		

	}

}
