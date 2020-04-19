package Methods;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("Number of vowels in the string: " + count_vowels(str) + "\n");
    }

    private static int count_vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        return count;
    }
}
