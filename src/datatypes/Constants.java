package datatypes;

public class Constants {

    private final double pi;
    private final double e;
    public double squareRootOf2;
    public double fiEqualis;
    char V2 = 8730;
    char fi = 966;

    public Constants(double pi, double e) {
        this.pi = pi;
        this.e = e;
    }

    public static void main(String[] args) {
        Constants coConstants = new Constants(3.141592653589793238462643, 2.718281828459045235360287);
        coConstants.squareRootOf2 = 1.414213562373095048801688;
        coConstants.fiEqualis = 1.618033988749894848204586;
        byte zero = 0;
        byte one = 1;
        byte two = 2;
        System.out.println(zero + " (zero)");
        System.out.println(one + " (one), the natural number after zero");
        System.out.println(coConstants);
        System.out.printf("e,approximately equal to %.24f%n", Math.E); //doesn't show after 45
        System.out.println("i,the imaginary unit such that i²=-1");
        System.out.println(coConstants.V2 + "2(square root of 2),the lenght of the diagonal of a square with unit side," +
                "approximately equal to" + coConstants.squareRootOf2);
        System.out.println(coConstants.fi + "(golden ratio),approximately equal to" + coConstants.fiEqualis + ", or" +
                "algebraically," + one + "+" + coConstants.V2 + "5/" + two);

    }

    @Override
    public String toString() {
        return "\u03C0 (pi),the constant representing the ratio of a circle's circumference to its diameter," +
                "approximately equal to " + pi + ".\n" +
                "e,approximately equal to " + e;

    }
}






