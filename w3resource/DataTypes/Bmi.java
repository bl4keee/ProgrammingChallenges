package DataTypes;

import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Input height in inches: ");
        double height = scanner.nextDouble();
        scanner.close();

        double weightInKg = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double BMI = weightInKg / (heightInMeters * heightInMeters);
        System.out.println("Body Mass Index is: " + BMI + "\n");
    }
}
