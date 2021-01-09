package homework7;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5;


        System.out.print("Enter a number between 1 and 30: ");
        num1 = scanner.nextInt();
        System.out.print("Enter a number between 1 and 30: ");
        num2 = scanner.nextInt();
        System.out.print("Enter a number between 1 and 30: ");
        num3 = scanner.nextInt();
        System.out.print("Enter a number between 1 and 30: ");
        num4 = scanner.nextInt();
        System.out.print("Enter a number between 1 and 30: ");
        num5 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i <= num5; i++) {
            System.out.print("*");
        }

    }
}
