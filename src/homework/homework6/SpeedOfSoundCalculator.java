package homework.homework6;

import java.util.Scanner;

public class SpeedOfSoundCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the medium (air, water or steel): ");
        String medium = scanner.nextLine();
        System.out.print("Enter the distance that the sound wave will travel: ");
        double distance = scanner.nextDouble();
        switch (medium) {
            case "air" -> System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 1100));
            case "water" -> System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 4900));
            case "steel" -> System.out.printf("Sound will travel in the %s %.3f seconds", medium, (distance / 16400));
            default -> System.out.println("You have entered a wrong medium");
        }
    }
}
