import java.util.Scanner;

public class AsciiConverter {

	public static void main(String[] args) {
		
		// Declarations
		String input;
		
		// Scanner action
		System.out.println("Program outputs your text converted into ASCII decimal numbers.\nPlease enter the text...");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		System.out.println(input + ":");
		scanner.close();
		
		// for loop
		for (int i = 0; i < input.length(); i++) {
			System.out.print((int)input.charAt(i) + " ");
		}
	}

}
/*
ASCII converter

ASCII abbreviated from American Standard Code for Information Interchange, is a character encoding standard for electronic communication.


Write a program, which takes a text as input and converts it to ASCII decimal numbers.

For example:
Input: "abc"   
Output: 97 98 99

Input: "xyz"
Output: 120 121 122
*/