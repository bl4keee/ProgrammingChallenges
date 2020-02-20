package InterviewCoding;
import java.util.Scanner;

public class ReverseStringBasic {

	public static void main(String[] args) {
		
		// Declarations
		String str;
		String reversed = "";
		
		// Scanner action
		System.out.println("Please, enter a String to reverse: ");
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();

		// for loop reversing given String
		for (int i = str.length() - 1; i >= 0; i --) {
			reversed = reversed + str.charAt(i);
		}
		
		// output
		System.out.println("The reversed String is: \n" + reversed);
	}	
}
