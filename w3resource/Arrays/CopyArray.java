package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] arr2 = new int[11];
		
		System.out.println("Program copies the source array by iterating.");
		System.out.println("Source array: " + Arrays.toString(arr1));
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Copied array: " + Arrays.toString(arr2));

	}

}
