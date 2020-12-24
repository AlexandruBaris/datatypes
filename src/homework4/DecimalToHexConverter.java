package homework4;

import java.util.Scanner;

public class DecimalToHexConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int input = scanner.nextInt();

        String converting = Integer.toHexString(input);

        System.out.println("Method 1: Decimal to hexadecimal: " + converting);
    }
}
