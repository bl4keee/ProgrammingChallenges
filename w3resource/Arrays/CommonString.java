package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonString {

	public static void main(String[] args) {
		
		String[] arr1 = {"Adam", "Chloe", "John", "Amber"};
		String[] arr2 = {"Amber", "Patrick", "Michael", "John"};
		
		System.out.println("The program finds the common Strings between two arrays.");
		System.out.println("The first array: " + Arrays.toString(arr1));
		System.out.println("The seocnd array: " + Arrays.toString(arr2));
		
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					set.add(arr1[i]);
				}
			}
		}
		
		System.out.println("The common strings are: " + (set));

	}

}
