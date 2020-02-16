import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompositeNumber {

	public static void main(String[] args) {
		
		// Declarations
		int input;
		//ArrayList<Integer> divisors = new ArrayList<Integer>();
		
		// Scanner action
		System.out.println("Please, enter the composite number: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		scanner.close();
		
		// Checking if user entered composite number of not
		if(!isPrime(input) && input > 1) {
			System.out.println(input + " is a composite number.");
		} else {
			System.out.println(input + " is not a composite number.\nIt has no other divisors other than 1 and itself.");
		}
	}
		
		// isPrime method
		private static boolean isPrime(int value) {
			for (int i = 2; i < value; i ++) {
				if (value % i == 0) {
					return false;
				}
			}
		return value > 1;
	}
	
}
