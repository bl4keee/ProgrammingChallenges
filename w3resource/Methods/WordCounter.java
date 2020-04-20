package Methods;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("Number of words in the string: " + count_words(str) + "\n");
    }

    private static int count_words(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
}
