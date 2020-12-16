package datatypes;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which is the number of the world's population?");
        long number = scanner.nextLong();

        System.out.println("Which is the annual growth rate?");
        double number2 = scanner.nextDouble();

        System.out.println("Which is the first source of information?");
        String answer = scanner.next();

        System.out.println("Which is the second source of information?");
        String answer2 = scanner.next();

        System.out.println("You answered :\n" +
                "Current World Population is " + number + "\n" +
                "The annual growth rate is " + number2 + "\n" +
                "The first source of info is " + answer + "\n" +
                "The second source is " + answer2);

    }
}
