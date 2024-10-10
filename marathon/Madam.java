package marathon;

public class Madam {

	public static void main(String[] args) {
		String input= "MADAM";
		String reversed = new StringBuilder(input).reverse().toString();
		if (input.equals(reversed)) {
			System.out.println("it is palindrome");
		}
		
		
	}
}