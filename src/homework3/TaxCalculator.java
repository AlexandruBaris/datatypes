package homework3;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money in dollars and cents: ");
        double amount = scanner.nextDouble();

        double addingTax = amount * 0.05;
        double taxIncluded = amount + addingTax;

        System.out.printf("%.2f", taxIncluded);

    }
}
