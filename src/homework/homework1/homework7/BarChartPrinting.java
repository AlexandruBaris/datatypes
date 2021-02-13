package homework.homework1.homework7;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Enter 5 numbers between 1 and 30: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();
        asteriskCalculator(num1);
        asteriskCalculator(num2);
        asteriskCalculator(num3);
        asteriskCalculator(num4);
        asteriskCalculator(num5);
    }

    public static void asteriskCalculator(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
