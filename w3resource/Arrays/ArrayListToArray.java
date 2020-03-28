package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Eve");
		list.add("John");
		list.add("Blake");
		list.add("Carmen");
		
		String[] arr = new String[list.size()];
		
		list.toArray(arr);
		
		// First method to print an array
		
		for (String string : arr) {
			
			System.out.println(string);
		}
		
		// Second method to print an array
		
		System.out.println();
		System.out.println("Array: " + Arrays.toString(arr));

	}

}
