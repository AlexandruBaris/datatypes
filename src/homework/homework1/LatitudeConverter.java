package homework.homework1;

import java.util.Scanner;

public class LatitudeConverter {
    public static void main(String[] args) {

        double latitude;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a latitude in degrees, minutes and seconds:\n" +
                "First enter the degrees: ");
        double degrees = scanner.nextDouble();

        System.out.print("Next, enter the minutes of arc: ");
        double minutes = scanner.nextDouble();

        System.out.print("Finally, enter the seconds of arc: ");
        double seconds = scanner.nextDouble();

        latitude = degrees + minutes / 60 + seconds / 3600;

        System.out.printf(degrees + " degrees, " + minutes + " minutes, " + seconds + " seconds = %.4f%n", latitude);


    }
}
