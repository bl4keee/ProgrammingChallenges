package String;

public class GetUnicode {

    public static void main(String[] args) {

        String str = "Mars";
        System.out.println("The original string: " + str);

        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(2);

        System.out.println("Character(unicode point) at 1 position: " + val1);
        System.out.println("Character(unicode point) at 2 position: " + val2);
    }
}
