package homework5;

import java.util.Scanner;

public class VowelAndConsonantDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        boolean isVowel = false;

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> isVowel = true;
        }

        if (isVowel) {
            System.out.println(letter + " is a Vowel");
        } else {
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
                System.out.println(letter + " is a Consonant");
            else
                System.out.println("Input is not an alphabet");
        }

    }
}
