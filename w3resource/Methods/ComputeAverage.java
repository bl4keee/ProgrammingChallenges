package Methods;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int first = scanner.nextInt();
        System.out.println("Input the second number: ");
        int second = scanner.nextInt();
        System.out.println("Input the third number: ");
        int third = scanner.nextInt();
        scanner.close();
        System.out.println("The average value is: " + average(first, second, third) + "\n");
    }

    private static int average(int first, int second, int third) {
        return (first + second + third) / 3;
    }
}
