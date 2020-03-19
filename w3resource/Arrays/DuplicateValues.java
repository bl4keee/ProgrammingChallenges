package arrays;

import java.util.Arrays;

public class DuplicateValues {

	public static void main(String[] args) {
			
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("Program finds duplicate elements in an array.");
		System.out.println("Original array: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println("Duplicate element: " + arr[j]);
				}
			}
		}

	}

}
