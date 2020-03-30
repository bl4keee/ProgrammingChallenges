package DataTypes;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value for inch: ");
		double inch = scanner.nextDouble();
		scanner.close();
		
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters.");

	}

}
