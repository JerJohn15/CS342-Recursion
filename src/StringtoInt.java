
/**
 * Recursive Assignment #2
 * @details - Take a string of digits and convert them to an integer
 * recursively. 
 * @author - Jeremiah Johnson 
 */

public class StringtoInt {
	static int number =1;
	static int convertedInt = 0;
	static String places = "";


	public static void main(String[] args) {

		String number = "235";	
		System.out.println("Original Number: \n" +number);
		System.out.println(convert(number,number.length()));
	}

	/**
	 * @method - convert
	 * @param - data, n
	 * @details - Converts a string to an int recursively
	 * by the following formula:
	 * digit1 * current  + digit2 * data.length-1 + ... +
	 * digitnth * data.length = convertedString
	 * @return - convertedInt
	 */

	public static int convert(String data,int n){
		if(data.length()==0){
			return 0;
		}
		//gets the place number
		String zeros = "%-" + n + "s";
		places = String.format(zeros, 1 ).replace(' ', '0');
		//place number is 1 * n zeros
		int placeNumber = Integer.parseInt(places);
		//current digit during iteration 
		int digit = Integer.parseInt(data.substring(0,1));

		System.out.println("Recursive iteration: ");
		System.out.print( placeNumber + " * " + digit + " + "
				+ convertedInt);


		number =  digit * placeNumber;
		convertedInt = number + convertedInt;

		System.out.println(convertedInt);

		convert(data.substring(1),data.length()-1);	
		return convertedInt;
	}




}
