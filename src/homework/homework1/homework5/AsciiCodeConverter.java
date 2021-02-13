package homework.homework1.homework5;

import java.util.Scanner;

public class AsciiCodeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        byte asciiCode = scanner.nextByte();
        System.out.println("The character for ASCII code " + asciiCode + " is " + (char) asciiCode);
    }
}
