package datatypes;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which is the number of the world's population?");
        long worldPopulation = scanner.nextLong();

        System.out.println("Which is the annual growth rate?");
        double growthRate = scanner.nextDouble();

        System.out.println("Which is the first source of information?");
        String firstSource = scanner.next();

        System.out.println("Which is the second source of information?");
        String secondSource = scanner.next();

        System.out.println("You answered :\n" +
                "Current World Population is " + worldPopulation + "\n" +
                "The annual growth rate is " + growthRate + "\n" +
                "The first source of info is " + firstSource + "\n" +
                "The second source is " + secondSource);

    }
}
