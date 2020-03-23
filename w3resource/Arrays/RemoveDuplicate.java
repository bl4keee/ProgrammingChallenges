package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	static void unique_array(int[] arr) {
		
		System.out.println("Original array: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + "\t");
		}
		
		// when all elements in input arr are unique
		
		int no_unique_elements = arr.length;
		
		// comparing each element with other elements
		
		for (int i = 0; i < no_unique_elements; i++) {
			
			for (int j = i + 1; j < no_unique_elements; j++) {
				
				// when two elements are equal
				
				if (arr[i] == arr[j]) {
					
					// replace duplicate with last unique element
					
					arr[j] = arr[no_unique_elements - 1];
					
					no_unique_elements--;
					
					j--;
				}
			}
		}
		
		// copying only unique elements of arr into arr2
		
		int[] arr2 = Arrays.copyOf(arr, no_unique_elements);
		
		System.out.println();
		
		System.out.println("Array with unique values: ");
		
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.print(arr2[i] + "\t");
			
		}
		
		System.out.println();
		
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		
		unique_array(new int[] {2, 6, 2, 8, 0, 1});
		unique_array(new int[] {24, -17, 39, -17, 83, 45});
	}

}
