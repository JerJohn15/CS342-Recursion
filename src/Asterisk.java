

public class Asterisk {

	/**
	 * 
	 * @author - Jeremiah Johnson 
	 */
	
	public static void main(String[] args) {
		System.out.println("output 1: ");
		//asterisk at nth line is 9 since 0-8 in C.S. lang. is 1 to 9
		printAsterisk("",0,8);
		System.out.println("output 2: ");
		printAsterisk("",1,10);
		}
	
	
	/**
	 * @method -printAsterisk
	 * Recursively prints an asterisk ascending and decending
	 * @param b
	 * @param i
	 * @param n
	 */
	
	public static void printAsterisk(String b,int n,int nth){
		
	
		if(n <= nth){
		String a = "*";	
		       b = a + b;//* on first line,*+ (n+1) on second line
			System.out.println(b);//prints ascending *
			n++;			
			printAsterisk(b,n,nth);//b = a + bth *
	
			System.out.println(b);//prints decending *

		}	
	
		
	}
	


}

