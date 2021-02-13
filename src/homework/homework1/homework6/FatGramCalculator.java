package homework.homework1.homework6;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of calories: ");
        double totCalories = input.nextDouble();
        System.out.print("Enter the amount of fat in grams: ");
        double totFat = input.nextDouble();
        double caloriesFromFat = totFat * 9;
        double percentageOfCalories = caloriesFromFat % totCalories;
        if (percentageOfCalories < 30) {
            System.out.println("The food is low in fat.");
        } else {
            System.out.println("The percentage of the calories that come from fat is " + percentageOfCalories);
        }
    }
}
