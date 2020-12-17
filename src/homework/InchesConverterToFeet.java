package homework;

import java.util.Scanner;

public class InchesConverterToFeet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height in inches : ");
        int inches = scanner.nextInt();

        int feet = inches / 12;
        int leftover = inches % 12;

        System.out.print("Your hight in feet and inches is = " + feet + " feet " + "and " + leftover + " inches");

    }
}
