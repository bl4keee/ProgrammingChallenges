package Methods;

import java.util.Scanner;

public class PasswordValidator {

    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consist of only letters and digits.\n" +
                "3. A password must contain at least two digits.\n" +
                "Input a password: ");

        String userinput = scanner.nextLine();

        if (is_Valid_Password(userinput)) {
            System.out.println("Password: " + userinput + " is valid.");
        } else {
            System.out.println("Password: " + userinput + "is not valid.");
        }

    }

    private static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return  false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }

        return (charCount >= 2 && numCount >= 2);

    }

    private static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    private static boolean is_Letter(char ch) {

        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}
