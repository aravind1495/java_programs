package programs;

public class Swap2Numbers {
	
	public static void main (String[] args) {
		
		//Using 3rd  variable
		
		int x = 2;
		int y = 5;
		System.out.println("x = "+x+", y = "+y);
		
		int temp = 0;
		
		temp = x;
		x  =  y;
		y = temp;
		
		System.out.println("x = "+x+", y = "+y);
		
		//Without using 3rd variable
		
		x = 2;
		y = 5;
		System.out.println("\nx = "+x+", y = "+y);
		
		
		x =  x + y;
		y = x - y;
		x = x - y;
		
		//y = x+y-(x=y); - in single statement
				
		System.out.println("x = "+x+", y = "+y);		
	}

}
