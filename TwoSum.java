package InterviewCoding;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		// Declarations
		int[] numbers = new int[] {2, 3, 7, 4, 8};
		int target = 7;
		int[]  result = getTwoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);

	}
	
	// getTwoSum method
	public static int[] getTwoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> visitedNumbers = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int delta = target - numbers[i];
			if (visitedNumbers.containsKey(delta)) {
				return new int[] {i, visitedNumbers.get(delta)};
			}
			visitedNumbers.put(numbers[i], i);
		}
		return new int[] {-1, -1};
		
	}

}

/*
Given an array of integers, return indices of two numbers such 
that they add up to a specific target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15]
target = 9

Because nums[0] + nums[1] = 2 + 7 = 9
return [0, 1]
*/