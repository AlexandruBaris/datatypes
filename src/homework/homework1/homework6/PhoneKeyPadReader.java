package homework.homework1.homework6;

import java.util.Scanner;

public class PhoneKeyPadReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char input = Character.toUpperCase(scanner.next().charAt(0));

        if (input >= 65 && input <= 67)
            System.out.println(input + "'s corresponding digit is " + 2);
        else if (input >= 68 && input <= 70)
            System.out.println("The corresponding number is " + 3);
        else if (input >= 71 && input <= 73)
            System.out.println("The corresponding number is " + 4);
        else if (input >= 74 && input <= 76)
            System.out.println("The corresponding number is " + 5);
        else if (input >= 77 && input <= 79)
            System.out.println("The corresponding number is " + 6);
        else if (input >= 80 && input <= 83)
            System.out.println("The corresponding number is " + 7);
        else if (input >= 84 && input <= 86)
            System.out.println("The corresponding number is " + 8);
        else if (input >= 87 && input <= 90)
            System.out.println("The corresponding number is " + 9);
        else System.err.println("invalid char " + input);

    }
}
