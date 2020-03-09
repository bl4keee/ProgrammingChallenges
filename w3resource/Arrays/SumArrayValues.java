package arrays;

import java.util.Scanner;

public class SumArrayValues {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Program sums all of the entered elements in the array. ");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please, enter the number: ");
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		
		int sum = 0;
		
		
		for (int i: numbers)
			sum += i;
		System.out.println("The sum of the elements in the array is: " + sum);
		

	}

}
