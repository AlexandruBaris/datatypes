package homework.homework10.homework12;

import java.util.Scanner;

public class CommonPrefix {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();
        System.out.print("Enter the second string: ");
        String secondString = scanner.next();

        int index = 0;
        String prefix = "";

        while (firstString.charAt(index) == secondString.charAt(index)) {
            prefix += firstString.charAt(index);
            index++;
        }

        if (prefix.length() > 0) {
            System.out.println("The common prefix is " + prefix);
        } else {
            System.out.println(firstString + " and " + secondString + " have no common prefix");
        }
    }
}
