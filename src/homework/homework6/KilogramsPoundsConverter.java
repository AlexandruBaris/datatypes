package homework.homework6;

public class KilogramsPoundsConverter {
    public static final double POUND_IN_KILOGRAM = 2.2;

    public static void main(String[] args) {
        System.out.printf("%-10s %10s\t|\t%-10s %10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        int pounds = 20;
        for (int kilogramsIs = 1; kilogramsIs <= 199; kilogramsIs++) {
            System.out.printf("%-10d %10.1f\t|\t%-10d %10.2f%n", kilogramsIs, (kilogramsIs * 2.2), pounds, (pounds * 0.4545));
            pounds = pounds + 5;
        }
    }

}

