package arrays;

import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		
		System.out.println("Program finds the maximum and minimum value of an array.");
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		max_min(arr);
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("Maximum value for the array: " + max);
		System.out.println("Minimum value for the array: " + min);

	}

	static int max;
	static int min;
	
	private static void max_min(int[] arr) {
		max = arr[0];
		min = arr[0];
		int len = arr.length;
		for (int i = 1; i < len - 1; i = i + 2) {
			if (i + 1 > len) {
				if (arr[i] > max) max = arr[i];
				if (arr[i] < min) min = arr[i];
			}
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > max) max = arr[i];
				if (arr[i + 1] < min) min = arr[i + 1];
			}
			if (arr[i] < arr[i + 1]) {
				if (arr[i] < min) min = arr[i];
				if (arr[i + 1] > max) max = arr[i + 1];
			}
		}
	}

}
