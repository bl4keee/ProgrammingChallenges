import java.util.Scanner;

public class TelephoneNumber {

	public static void main(String[] args) {
		
		// Declaration
		long userinput;
		
		// Scanner action
		System.out.println("Enter your phone number: ");
		Scanner scanner = new Scanner(System.in);
		userinput = scanner.nextLong();
		
		// Parse Long to String
		String st = Long.toString(userinput);
		
		// Check if everything is okay
		if (st.length() <= 15 && st.length() >= 7) {
			System.out.println("(+" + st.substring(0, 3) + ") " + st.substring(3, 5) + "-" + st.substring(5, st.length()));
		} else {
			System.out.println(userinput + " is not a valid number, please enter a valid phone number of maximum 15 digits!");
			return;
		}
		

	}

}
