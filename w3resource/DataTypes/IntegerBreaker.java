package DataTypes;

import java.util.Scanner;

public class IntegerBreaker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input six non negative digits: ");
        int input = scanner.nextInt();
        int n6 = input % 10;
        int n5 = input / 10 % 10;
        int n4 = input / 100 % 10;
        int n3 = input / 1000 % 10;
        int n2 = input / 10000 % 10;
        int n1 = input / 100000 % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }
}
