package homework.homework10.homework13;

import java.util.Scanner;

public class VowelAndConsonantsCounter {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                switch (Character.toUpperCase(input.charAt(i))) {
                    case 'A', 'E', 'I', 'O', 'U' -> vowels++;
                    default -> consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
