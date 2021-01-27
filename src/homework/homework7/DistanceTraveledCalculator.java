package homework.homework7;

import java.util.Scanner;

public class DistanceTraveledCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = 0;
        int time = 0;

        while (speed < 1) {
            System.out.print("Enter the speed of a vehicle(in miles-per-hour): ");
            speed = scanner.nextDouble();
        }
        while (time < 1) {
            System.out.print("Enter the number of hours it has traveled: ");
            time = scanner.nextInt();
        }
        System.out.println("\n" + "Hours\tDistance traveled\n-------------------------");
        for (int hour = 1; hour <= time; hour++) {
            double distance = speed * hour;
            System.out.println(hour + "\t\t" + distance);
        }
    }
}
