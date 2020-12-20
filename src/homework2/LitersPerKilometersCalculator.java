package homework2;

import java.util.Scanner;

public class LitersPerKilometersCalculator {
    public static double calculator(double distance, double liters) {
        return distance / liters;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance = scanner.nextInt();

        System.out.print("Enter the total liters consumption: ");
        int liters = scanner.nextInt();

        double total = 100 / calculator(distance, liters);

        System.out.print("Total consumption per 100 km is: " + total + "l/km");

    }
}
