package arrays;

public class FindIndex {

	public static void main(String[] args) {
		int[] my_array = {44, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("Inedex position of 44 is: " + findIndex(my_array, 44));
		System.out.println("Index position of 29 is: " + findIndex(my_array, 29));
	}

	private static int findIndex(int[] my_array, int t) {
		if (my_array == null) return -1;
		int len = my_array.length;
		int i = 0;
		while (i < len) {
			if (my_array[i] == t) return i;
			else i = i + 1;
		}
		return -1;
	}

}
