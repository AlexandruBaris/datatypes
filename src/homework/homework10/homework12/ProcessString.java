package homework.homework10.homework12;

import java.util.Scanner;

public class ProcessString {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.next();
        String oddSequence = "";

        for (int i = 0; i < input.length(); i += 2) {
            oddSequence += input.charAt(i);
        }
        System.out.println(oddSequence);
    }
}
