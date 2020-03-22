package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonInteger {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {5, 6, 7, 2, 9};
		
		System.out.println("Program finds common Integer values between two arrays.");
		System.out.println("The first array: " + Arrays.toString(arr1));
		System.out.println("The second array: " + Arrays.toString(arr2));
		
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
				}
			}
		}
		System.out.println("Common elements: " + (set));
	}

}
