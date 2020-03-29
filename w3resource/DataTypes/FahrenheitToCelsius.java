package DataTypes;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		scanner.close();

		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
	}

}
