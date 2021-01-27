package homework.homework5;

import java.util.Scanner;

public class AreaOfAPentagonCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double radius = scanner.nextDouble();
        double lengthOfASide = 2 * radius * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(lengthOfASide, 2) / (4 * Math.tan(Math.PI / 5)));
        System.out.printf("The are of the pentagon is %.2f", area);

    }

}
