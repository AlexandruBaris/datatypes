package homework.homework5;

import java.util.Scanner;

public class PentagonAreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double radius = scanner.nextDouble();

        double lengthOfSide = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(lengthOfSide, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
