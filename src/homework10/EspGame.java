package homework10;

import java.util.Random;
import java.util.Scanner;

public class EspGame {
    public static final String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};

    public static String getComputerDecision() {
        Random random = new Random();
        int randomColor = random.nextInt(colors.length);
        return colors[randomColor];
    }

    public static String userGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color that you think the computer has selected (Red, Green, Blue, Orange, Yellow): ");
        return scanner.next().toUpperCase();
    }

    public static void startGame() {
        int total = 0, correctGuess = 0;

        while (total < 10) {
            String user = userGuess();
            String computer = getComputerDecision();
            System.out.println("Computer chosed: " + computer);
            if (user.equalsIgnoreCase(computer)) {
                correctGuess++;
            }
            total++;
        }
        System.out.println("You have gotten " + correctGuess + "/10 guesses correct!");
    }
}
