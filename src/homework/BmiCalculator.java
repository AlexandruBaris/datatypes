package homework;

public class BmiCalculator {
    public static double getBmiIndex(double height, double weight) {

        double kilograms = 74;
        double meters = 1.82;
        double bmi = kilograms / Math.pow(meters, 2);

        return bmi;
    }
}




