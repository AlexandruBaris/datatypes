package homework12;

import java.util.Scanner;

public class CheckISBN {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = scanner.next();

        int checkSum = 10 - (isbn.charAt(0) + isbn.charAt(2) + isbn.charAt(4) + isbn.charAt(6) + isbn.charAt(8) + isbn.charAt(10) +
                3 * (isbn.charAt(1) + isbn.charAt(3) + isbn.charAt(5) + isbn.charAt(7) + isbn.charAt(9) + isbn.charAt(11))) % 10;

        if (isbn.length() != 12) {
            System.out.print(isbn + " is an invalid input");
            if (checkSum == 10) checkSum = 0;

        }
        System.out.println("The ISBN-13 number is: " + isbn.substring(0, 12).concat(Integer.toString(checkSum)));
    }
}
