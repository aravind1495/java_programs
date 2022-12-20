package programs;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		long num = 12121212123L;
		int count = 0;
		
		while (num != 0) {
			
			num = num / 10;
			count++;
		}
		
		System.out.println("Total digits in a given number: "+count);

	}

}
