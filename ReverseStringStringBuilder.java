package InterviewCoding;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		
		
		// Declarations
		String str = "Hello World!";
		System.out.println(reverseWithStringBuilder(str));
		
	}
		// Reversing String method
		private static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str)
					.reverse()
					.toString();
				
	}

}
