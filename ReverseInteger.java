package InterviewCoding;
import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// Declarations
		int input;
		
		// Scanner action
		System.out.println("Please, enter an Integer to reverse: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		scanner.close();
		
		// output
		System.out.println("Your reversed Integer is: " + reverse(input));

	}
	
	// method reversing given integer
	public static int reverse(int input) {
		long reversed = 0;
		while (input != 0) {
			reversed = reversed * 10 + input % 10;
			input /= 10;
			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				return 0;
			}
		}
		return (int) reversed;
		
	}

}
