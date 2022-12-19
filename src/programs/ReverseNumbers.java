package programs;

public class ReverseNumbers {

	public static void main(String[] args) {

		int num = 12345, rev = 0;
		
		int rem = 1;
		
		while (num != 0) {
			
			rem = num % 10;
			rev = rev*10 + rem; // rev = rev*10  + num%10;
			num = num / 10;
			
		}
		
		System.out.println(rev);
		
		
		
		//Reverse using StringBuffer
		
		double rev2 = 1.23; //(OR) can be int too
		
		StringBuffer sf = new StringBuffer(String.valueOf(rev2));
		
		sf.reverse();
		
		System.out.println(sf);
		

	}

}
