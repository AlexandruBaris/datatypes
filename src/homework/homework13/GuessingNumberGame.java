package homework.homework13;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {
    public static void main(String... args) {
        Random random = new Random();
        int computerNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("The number is generated, try to guess it: ");
        int playerNumber = scanner.nextInt();

        while (playerNumber != computerNumber) {
            if (playerNumber < computerNumber) {
                System.out.print("Too low, try again: ");
            } else {
                System.out.print("Too high, try again: ");
            }
            playerNumber = scanner.nextInt();
        }
        System.out.println("Correct! It was: " + computerNumber);
    }
}
