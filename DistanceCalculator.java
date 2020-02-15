import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		
		// Declarations
		Double x1, y1, x2, y2;
		Double result;
		
		// Scanner action
		System.out.println("The programm calculates the distance\nbetween two points using Pythagorean Theorem.\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the coordinates of the starting point (x1 y1)");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		System.out.println("Please, enter the coordinates of the ending point (x2 y2)");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		// Calculations
		result = Math.sqrt(Math.pow((x2-x1) , 2) + Math.pow((y2-y1), 2));
				
		// Output
		System.out.println("The distance is: " + result);
	}

}
