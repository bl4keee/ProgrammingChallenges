import java.util.Scanner;
public class GapfulNumbers {

		// Checking method 
		static boolean checkGapful(String num) {
			if (num.length() <3) {
				System.out.println("Length should be more than 3. Try again.");
				System.exit(0);
			}
			return Integer.parseInt(num) %
					(Integer.parseInt(String.valueOf(num.charAt(0)) +
					String.valueOf(num.charAt(num.length()-1)))) == 0?true:false;
		}
		
		// Main method
		public static void main(String[] args) {
			System.out.println("Program checks if your number is gapful or not.\nPlease, enter the number...");
			System.out.printf(checkGapful(new Scanner(System.in).nextLine())?"Gapful Number":"Not a Gapful Number");
		}
}

/*
Gapful Numbers

A gapful number is a number of at least 3 digits that is divisible by the number formed by the first and last digit of the original number.

For Example:
Input: 192
Output: true (192 is gapful because it is divisible 12)

Input: 583
Output: true (583 is gapful because it is divisible by 53)

Input: 210
Output: false (210 is not gapful because it is not divisible by 20)

Write a program to check if the user input is a gapful number or not.
*/