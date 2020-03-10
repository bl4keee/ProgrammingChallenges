package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Please, enter the number: ");
			nums[i] = scanner.nextInt();
			sum = sum + nums[i];
		}
		scanner.close();
		
		double average = sum / nums.length; 
		
		System.out.println();
		System.out.println("The array: " + Arrays.toString(nums));
		System.out.println("The average value of the array elements: " + average);
	}

}
