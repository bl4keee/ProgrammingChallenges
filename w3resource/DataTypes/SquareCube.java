package DataTypes;

import java.util.Scanner;

public class SquareCube {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value: ");
        double val = scanner.nextDouble();
        scanner.close();

        System.out.println("Square: " + val * val);
        System.out.println("Cube: " + val * val * val);
        System.out.println("Fourth power: " + Math.pow(val, 4));
    }
}
