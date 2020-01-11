import java.util.Scanner;
public class RemoveSpaces {

	public static void main(String[] args) {
		
		// Declarations
		String userinput;
		
		// Scanner action
		System.out.println("Program outputs entered text without spaces.\nPlease, enter the text...\n");
		Scanner scanner = new Scanner(System.in);
		userinput = scanner.nextLine().replace(" ", "");
		scanner.close();
		
		// Output
		System.out.println(userinput);
		


	}

}

/*
Remove Spaces from a String

Given a string as input, output it without spaces.

For example:
string = "ab c  d e fgh i  j kl mn  opqr  stuvwxyz"
result = "abcdefghijklmnopqrstuvwxyz"
*/