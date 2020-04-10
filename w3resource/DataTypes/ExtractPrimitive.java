package DataTypes;

import java.math.BigInteger;

public class ExtractPrimitive {
    public static void main(String[] args) {

        BigInteger bigVal = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: " + bigVal);

        long val_Long = bigVal.longValue();
        System.out.println("\nConvert given BigInteger to an long value: " + val_Long);

        int val_Int = bigVal.intValue();
        System.out.println("\nConvert given BigInteger to an int value: " + val_Int);

        short val_short = bigVal.shortValue();
        System.out.println("\nConvert given BigInteger to a short value: " + val_short);

        byte val_byte = bigVal.byteValue();
        System.out.println("\nConvert given BigInteger to a byte: " + val_byte);

        long val_longexact = bigVal.longValueExact();
        System.out.println("\nConvert given BigInteger to exact long: " + val_longexact);
    }
}
