package InterviewCoding;

public class ReverseStringManually {

	public static void main(String[] args) {
		
		// Declarations 
		String str = "Hello World!";
		System.out.println(reverseManually(str));

	}

	private static String reverseManually(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
