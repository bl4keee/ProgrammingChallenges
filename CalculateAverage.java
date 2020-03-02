import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		
		// Declarations
		int input = 0;
		double average;
		
		// Ask the user
		System.out.println("How many numbers you want to enter?");
		
		// Scanner action
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		// Creating array of user input and setting total to 0
		double[] array = new double[input];
		double total = 0;
		
		// loop getting user input into array
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter Element No." + (i+1) + ": ");
			array[i] = scanner.nextDouble();
		}
		scanner.close();
		
		// loop calculating total
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		average = total / array.length;
		System.out.format("The average is:  %.3f", average);
	}

}
