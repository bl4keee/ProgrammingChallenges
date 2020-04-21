package DataTypes;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int input = scanner.nextInt();
        System.out.println("The sum of the digits of given Integer is: " + sumDigits(input));
    }

    private static int sumDigits(int n) {
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
