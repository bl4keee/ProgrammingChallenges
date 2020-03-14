package arrays;

import java.util.Arrays;

public class ArrayRemove {

	public static void main(String[] args) {
		
		int[] arr = new int[] {25, 14, 56, 15, 36};
		
		System.out.println("Program removes specified element from the array.");
		System.out.println("Original array: " + Arrays.toString(arr));
		
		int removeIndex = 1; // removing the second element
		
		for(int i = removeIndex; i < arr.length -1; i++) {
			arr[i] = arr[i + 1];
		}
		
		System.out.println("Removing the second element: " + Arrays.toString(arr));
		

	}

}
