package datatypes;

public class Constants {

    public static final double golden = (1 + Math.sqrt(5)) / 2;
    public final byte zero = 0;
    public final short one = 1;
    public final double pi = Math.PI;
    public final double iii = 2.718281828459045235360287;
    public final double root = Math.sqrt(2);
    public String elevate = "i²=-1";
    public char fi = 966;
    String zer = " (zero)";
    String on = " (one), the natural number after zero";

    public static void main(String[] args) {
        Constants constants = new Constants();
        System.out.println("* " + constants.zero + constants.zer);
        System.out.println("* " + constants.one + constants.on);
        System.out.println("* \u03C0 (pi),the constant representing the ratio of a circle's circumference\n" +
                " to its diameter, approximately equal to " + constants.pi);
        System.out.printf("* e,approximately equal to %.24f%n", Math.E);
        System.out.println("* i,the imaginary unit such that " + constants.elevate);
        System.out.println("* √2(square root of 2), the lenght of the diagonal of a square with\n" +
                "unit sides, approximately equal to " + constants.root);
        System.out.println(constants.fi + "(golden ratio),approximately equal to " + constants.golden + " or algebraically," + constants.one + "+√5/2");
    }


}






