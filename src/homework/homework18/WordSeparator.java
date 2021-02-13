package homework.homework18;

import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.next();
        splitString(text);

    }

    public static void splitString(String text) {
        String splitedString = "";
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (Character.isUpperCase(ch))
                splitedString += " " + Character.toLowerCase(ch);
            else
                splitedString += ch;
        }
        System.out.print(splitedString);
    }
}
