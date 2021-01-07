package homework7;

import java.util.Scanner;

public class ProductOfOddIntegersCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Odd number in range (1-15): ");
        int number = scanner.nextInt();
        if (number < 1 | number >= 15) {
            System.out.print("Entered number is out of range");
        } else if (number % 2 != 0) {
            number *= number;
            System.out.print("The product is: " + number);
        } else {
            System.out.print("Entered number is not Odd");
        }
    }
}

