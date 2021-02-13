package homework.homework1.homework6;

import java.util.Scanner;

public class NumberOfDaysFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month number: ");
        byte month = scanner.nextByte();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Total number of days = 31");
            case 2 -> System.out.println("Total number of days = 28/29");
            case 4, 6, 9, 11 -> System.out.println("Total number of days = 30");
            default -> System.out.println("You have entered a wrong number of month");
        }
    }
}
