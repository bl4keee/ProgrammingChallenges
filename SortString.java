import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		// Declarations
		String input;
		char [] chArray; // array for characters of user's string
		String output;
		
		// Scanner action
		System.out.println("Please, enter the String: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine().toLowerCase(); // user input to lower case
		scanner.close();
		System.out.println("***Sorting your String alphabetically***");
		
		
		// Adding characters from user input to array, then sorting it
		chArray = input.toCharArray();
		Arrays.parallelSort(chArray);
		
		output = new String(chArray).replaceAll(" ", ""); // creating a String from characters from array, removing white spaces
		
		// Output
		System.out.println("Your entered String was: " + input + "\nThe sorted String is: " + output);
	}

}
