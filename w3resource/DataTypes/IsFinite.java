package DataTypes;

public class IsFinite {
    public static void main(String[] args) {

        Double d1 = 0.00003255d;
        boolean d1f = Double.isFinite(d1);
        Double d2 = d1 / 0;
        boolean d2f = Double.isFinite(d2);
        Double d3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(d3);

        System.out.println("\nFinite doubles\n------------");
        System.out.println("Is " + d1 + " finite? " + d1f);
        System.out.println("Is " + d2 + " (d1/0) finite? " + d2f);
        System.out.println("Is " + d3 + " finite? " + d3f);

        Float f1 = 4.5f;
        boolean f1f = Float.isFinite(f1);
        Float f2 = f1/0;
        boolean f2f = Float.isFinite(f2);
        Float f3 = 0f/0f;
        boolean f3f = Float.isFinite(f3);

        System.out.println("\nFinite floats\n------------");
        System.out.println("Is " + f1 + " finite? " + f1f);
        System.out.println("Is " + f2 + " (f1/0) finite? " + f2f);
        System.out.println("Is " + f3 + " finite? " + f3f);
    }
}
