package DataTypes;

public class CompareSignedUnsigned {
    public static void main(String[] args) {

        int firstint = Integer.MIN_VALUE;
        int secondint = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + firstint + ", " + secondint);
        System.out.println("--------------------------------");

        int compare_signed = Integer.compare(firstint, secondint);
        System.out.println("Result of comparing signed numbers: " + compare_signed);

        int compare_unsigned = Integer.compareUnsigned(firstint, secondint);
        System.out.println("Result of comparing unsigned numbers: " + compare_unsigned);
    }
}
