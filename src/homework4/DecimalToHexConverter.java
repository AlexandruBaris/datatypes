package homework4;

import java.util.Scanner;

public class DecimalToHexConverter {

    public static void checkNum(int input) {
        if (input > 15) {
            System.out.print(input + " is an invalid input");
        } else if (input < 0) {
            System.out.print(input + " is an invalid input");
        } else {
            System.out.println("The hex value is " + Integer.toHexString(input));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15) : ");
        int input = scanner.nextInt();

        checkNum(input);
    }
}

