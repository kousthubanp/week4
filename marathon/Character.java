package marathon;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "Welcome to chennai";
	      char target = 'e';
	      int count = 0;
	      for(int i= 0;i<input.length();i++){
			if (input.charAt(i)==target){
	          count++;
	        }
	      }
			System.out.println(count);
	}

}
