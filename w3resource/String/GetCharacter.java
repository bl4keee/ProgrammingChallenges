package String;

public class GetCharacter {

    public static void main(String[] args) {

        String str = "Exercise";
        System.out.println("The original string: " + str);

        int index1 = str.charAt(0);
        int index5 = str.charAt(5);

        System.out.println("Character at position 0 is: " + (char)index1);
        System.out.println("Character at position 5 is: " + (char)index5);
    }
}
