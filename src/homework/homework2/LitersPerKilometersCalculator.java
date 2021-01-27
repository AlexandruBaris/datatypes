package homework.homework2;

import java.util.Scanner;

public class LitersPerKilometersCalculator {
    public static double calculateconsumption(double distance, double liters) {
        return distance / liters;

    }

    public static void main(String[] args) {

        final long DISTANCE_CONSUMPTION_KM = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        int distance = scanner.nextInt();

        System.out.print("Enter the total liters consumption: ");
        int liters = scanner.nextInt();

        double consumedLiters = DISTANCE_CONSUMPTION_KM / calculateconsumption(distance, liters);

        System.out.print("Total consumption per 100 km is: " + consumedLiters + "l/km");


    }
}
