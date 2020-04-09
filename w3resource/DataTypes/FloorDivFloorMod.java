package DataTypes;

public class FloorDivFloorMod {
    public static void main(String[] args) {
        int a = -2345;
        int b = 125;

        System.out.println();
        System.out.println("Floor division using '/' operator: " + (a / b));
        System.out.println("Floor division using floorDiv() method: " + Math.floorDiv(a, b));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (a % b));
        System.out.println("Floor modulus using floorMod() method: " + Math.floorMod(a, b));

    }
}
