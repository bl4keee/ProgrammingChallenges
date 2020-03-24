package arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		System.out.println("The program finds the second largest element of an array.");
		
		int[] arr = {10789, 2035, 1899, 1456, 2013};
		
		System.out.println("Original array: " + Arrays.toString(arr));

		Arrays.sort(arr);
		
		int index = arr.length - 1;
		
		while (arr[index] == arr[arr.length - 1]) {
			
			index--;
		}
		
		System.out.println("Second largest value: " + arr[index]);
		
	}

}
