import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		
		// Declarations
		String password;
		
		// Scanner action
		Scanner scanner = new Scanner(System.in);
		password = scanner.nextLine();
		scanner.close();
		
		// Output
		System.out.println(password);
		System.out.println(validate(password));
	}

		// Validation method
		private static boolean validate(String password) {
			if (password.length() < 5 || password.length() > 10)  // min length 5, max length 10
				return false;
			if (! password.matches(".*\\d.*"))  // if there is no number, print false
				return false;
			if (! password.matches(".*\\W.*")) // if there is no special char, print false
				return false;
			if (password.matches(".*\\s.*")) // if contains whitespace print false
				return false;
			return true;
			// . means anything;  * means any number of times; \d means digit

}
}
/* 
Password Validator

Password validator is a program that validates passwords to match specific rules. For example, the minimum length of the password must be eight characters long and it should have at least one uppercase letter in it. 

A valid password is the one that conforms to the following rules:
 - Minimum length is 5;
 - Maximum length is 10;
 - Should contain at least one number;
 - Should contain at least one special character (such as &, +, @, $, #, %, etc.);
 - Should not contain spaces.

Examples:
Input: "Sololearn"
Output: false

Input: "John Doe"
Output: false

Input: "$ololearn7"
Output: true

Write a program to checks if the user input is a valid password or not.
*/
