package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String[] arr = {"Blake", "John", "Carmen", "Eve"};
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(list);

	}

}
