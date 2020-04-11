package Methods;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        int first, second, third;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        second = scanner.nextInt();
        System.out.println("Enter the third number: ");
        third = scanner.nextInt();
        scanner.close();
        System.out.println("The smallest value is: " + smallest(first, second, third) + "\n");
    }

    private static int smallest(int first, int second, int third) {
        return Math.min(Math.min(first, second), third);
    }
}
