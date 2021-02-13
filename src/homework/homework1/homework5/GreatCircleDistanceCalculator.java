package homework.homework1.homework5;

import java.util.Scanner;

public class GreatCircleDistanceCalculator {
    public static final double EARTH_RADIUS = 6371.01;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double firstLatitude = Math.toRadians(scanner.nextDouble());
        double firstLongitude = Math.toRadians(scanner.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double secondLatitude = Math.toRadians(scanner.nextDouble());
        double secondLongitude = Math.toRadians(scanner.nextDouble());

        double greatCircleDistance = Math.acos((Math.sin(firstLatitude) *
                Math.sin(secondLatitude)) + (Math.cos(firstLatitude) *
                Math.cos(secondLatitude) * Math.cos(firstLongitude - secondLongitude))) * EARTH_RADIUS;

        System.out.println("The distance between the two points is " + greatCircleDistance + " km");


        // System.out.println(d);
    }
}
