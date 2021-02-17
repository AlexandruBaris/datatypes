package homework.homework10.homework18;

import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.next();
        splitString(text);

    }

    public static void splitString(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i > 0 && Character.isUpperCase(text.charAt(i))) {
                stringBuilder.append(' ').append(Character.toLowerCase(text.charAt(i)));
            } else {
                stringBuilder.append(text.charAt(i));
            }
        }
        System.out.print(stringBuilder.toString());
    }
}
