package homework6;

public class MilesToKilometersConverter {
    public static final double KM_IN_A_MILE = 1.609;

    public static void main(String[] args) {
        System.out.print("Miles\t\tKilometers");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("\n%1d\t\t\t%.3f", mile, (mile * KM_IN_A_MILE));
        }
    }
}
