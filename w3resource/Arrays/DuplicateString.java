package arrays;

import java.util.Arrays;

public class DuplicateString {

	public static void main(String[] args) {
		
		String[] arr = {"bcd", "abd", "jude", "bcd", "oiu", "gze", "oiu"};
		System.out.println("Program finds duplicate String elements in an array.");
		System.out.println("Original array: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i].equals(arr[j])) && (i != j)) {
					System.out.println("Duplicate element: " + arr[j]);
				}
			}
		}

	}

}
