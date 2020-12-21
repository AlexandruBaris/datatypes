package homework2;

import java.util.Scanner;

public class DistancePerFuelConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INDEX_OF_CONVERTOR = 235.215;

        System.out.print("Enter the total consumption (l/100km): ");
        double litersPerKm = scanner.nextDouble();

        double milesPerGallons = INDEX_OF_CONVERTOR / litersPerKm;

        System.out.printf("Converting to the U.S. approach (distance/fuel): %.0f", milesPerGallons);
    }
}
