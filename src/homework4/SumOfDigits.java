package homework4;

import java.util.Scanner;

public class SumOfDigits {

    static int hundreds;
    static int tens;
    static int units;

    public static int SumOfDigitsCounter(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = (number % 100) % 10;
        return hundreds + tens + units;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 0 and 1000: ");
        int number = scanner.nextInt();

        System.out.println("The Sum of digits is: " + SumOfDigitsCounter(number));
    }
}
