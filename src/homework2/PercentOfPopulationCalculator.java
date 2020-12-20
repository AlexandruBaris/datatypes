package homework2;

import java.util.Scanner;

public class PercentOfPopulationCalculator {
    public static double calculatePercentage(double worldspopulation, double italypopulation) {
        return italypopulation * 100 / worldspopulation;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the world's population: ");
        long worldspopulation = scanner.nextLong();

        System.out.print("Enter the population of Italy: ");
        long italypopulation = scanner.nextLong();

        System.out.print("The population of Italy is " + calculatePercentage(worldspopulation, italypopulation) + "% of the world population.");
    }
}
