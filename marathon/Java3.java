package marathon;

public class Java3 {

	public static void main(String[] args) {
		String input = "race a car";
		String split = input.replace(" ","");
		System.out.println(split);
		String reversed = new StringBuilder(split).reverse().toString();
		System.out.println(reversed);
		if (split.equals(reversed)) {
			System.out.println("right");
		} else {
System.out.println("wrong");
		}
	}
	
		}


