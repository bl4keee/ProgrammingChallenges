package arrays;

public class ArrayContains {

	public static void main(String[] args) {
		
		int[] my_array1 = {
				1789, 2035, 1899, 1456, 2013,
				1458, 2458, 2016, 1455, 2956,
				1577, 2999, 1559, 1941, 2924};
		
		System.out.println("Does the array contains 2013?");
		System.out.println(contains(my_array1, 2013));
		System.out.println();
		System.out.println("Does the array contains 2015? ");
		System.out.println(contains(my_array1, 2015));

	}

	private static boolean contains(int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

}
