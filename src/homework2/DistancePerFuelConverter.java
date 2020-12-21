package homework2;

import java.util.Scanner;

public class DistancePerFuelConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total consumption (l/100km): ");
        double litersPerKm = scanner.nextDouble();

        double milesPerGallons = 235.215 / litersPerKm;

        System.out.printf("Converting to the U.S. approach (distance/fuel): %.0f", milesPerGallons);
    }
}
