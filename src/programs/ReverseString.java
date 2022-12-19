package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World!", rstr="";
		
		char c[] = str.toCharArray();  
		
		for (int i=0; i<str.length(); i++) {
			
			//rstr = c[i]+rstr;
			
			rstr = str.charAt(i)+rstr;
		}
		
		System.out.println(rstr);
		
		
		StringBuffer sf = new StringBuffer("Hello");
		sf.reverse();
		
		System.out.println(sf);
		

	}

}
