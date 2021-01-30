package homework.homework1;

import java.util.Scanner;

public class BmiConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in feet and inches: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter your weight in pounds: ");
        double pounds = scanner.nextDouble();

        double inches = feet * 12;
        double meters = inches * 0.0254;
        double kilograms = pounds / 2.2;
        double bmi = kilograms / Math.pow(meters, 2);

        System.out.print("The Body Mass Index (BMI) is: " + bmi + " kg/m2");
    }
}
