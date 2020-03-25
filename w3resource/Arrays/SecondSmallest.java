package arrays;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int[] arr = {-1, 4, 2, 7, -3};
		
		
		System.out.println("Program finds the second smallest element of the array.");
		
		System.out.println("Original array: " + Arrays.toString(arr));
		
		
		int min = Integer.MAX_VALUE;
		
		int second_min = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == min) {
				
				second_min = min;
				
			} else if (arr[i] < min) {
				
				second_min = min;
				
				min = arr[i];
				
			} else if (arr[i] < second_min) {
				
				second_min = arr[i];
			}
		}
		
		System.out.println("Second smallest number is: " + second_min);
		

	}

}
