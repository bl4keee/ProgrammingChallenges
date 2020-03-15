package arrays;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {25, 14, 56, 15, 36};
		int indexPosition = 2; 
		int newValue = 5; // inserting 5 on the 2nd index = 3 position
		System.out.println("Program inserts an element into an array.");
		System.out.println("Original array: " + Arrays.toString(arr1));
		
		for(int i = arr1.length-1; i > indexPosition; i--) {
			arr1[i] = arr1[i - 1];
		}
		
		arr1[indexPosition] = newValue;
		System.out.println("New array: " + Arrays.toString(arr1));
		
	}

}
