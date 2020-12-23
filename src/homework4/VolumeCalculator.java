package homework4;

import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and lenght of a cylinder: ");
        double radius = scanner.nextDouble();
        double lenght = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * lenght;

        System.out.printf("The are is %.4f", area);
        System.out.println();
        System.out.printf("The volume is %.1f", volume);

    }
}
