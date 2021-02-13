package homework.homework1.homework4;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 0 and 1000: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = (number % 100) % 10;
        int inputSum = hundreds + tens + units;

        System.out.println("The Sum of digits is: " + inputSum);
    }
}
