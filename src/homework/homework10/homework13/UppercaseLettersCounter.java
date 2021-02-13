package homework.homework10.homework13;

import java.util.Scanner;

public class UppercaseLettersCounter {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                counter++;
            }
        }
        System.out.print("The number of uppercase letters is: " + counter);
    }
}
