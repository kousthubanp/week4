package marathon;

public class Armstrong {

	public static void main(String[] args) {
		   int number = 153;
	        int result = 0;
	        int originalNumber = number;

	        while (originalNumber != 0) {
	            int digit = originalNumber % 10;
	            result += digit * digit * digit;
	            originalNumber /= 10;
	        }

	        System.out.println(number + " is an Armstrong number." );
	    }
	
	}


