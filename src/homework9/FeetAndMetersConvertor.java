package homework9;

public class FeetAndMetersConvertor {
    public static double FEET_TO_METER = 0.305;
    public static double METER_TO_FEET = 3.279;

    public static void main(String... args) {
        System.out.println("Feet     Meters      |     Meters     Feet\n" +
                "----------------------------------------------");
        double feet = 1.0, meters = 20.0;

        while (feet <= 10) {
            System.out.printf("%5.1f %10.3f     | %10.1f %10.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
            feet++;
            meters += 5;
        }
    }

    public static double footToMeter(double foot) {
        return FEET_TO_METER * foot;
    }

    public static double meterToFoot(double meter) {
        return METER_TO_FEET * meter;
    }
}
