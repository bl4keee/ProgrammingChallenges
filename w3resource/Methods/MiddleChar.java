package Methods;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("The middle character of your string is: " + middle(str) + "\n");
    }

    private static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}

