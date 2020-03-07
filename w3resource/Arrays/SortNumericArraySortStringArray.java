package arrays;

import java.util.Arrays;

public class SortNumericArraySortStringArray {

	public static void main(String[] args) {
		
		int[] numericArr = {1789, 2035, 1899, 1456, 2013};
		String[] strArr = {"Java", "Python", "Php", "C#", "C", "C++"};

		System.out.println("The original numeric array: " + Arrays.toString(numericArr));
		Arrays.sort(numericArr);
		System.out.println("Sorted numeric array: " + Arrays.toString(numericArr));
		
		System.out.println("The original String array: " + Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println("Sorted numeric array: " + Arrays.toString(strArr));
	}

}
