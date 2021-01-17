package homework10;

import java.util.Arrays;
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
        System.out.print("Enter the color that you think the computer has selected " + Arrays.toString(colors) + ": ");
        return scanner.next().toUpperCase();
    }

    public static void startGame() {
        int questions = 0, correctGuess = 0;

        while (questions < 10) {
            String user = userGuess();
            String computer = getComputerDecision();
            System.out.println("Computer chosed: " + computer);
            if (user.equalsIgnoreCase(computer)) {
                correctGuess++;
            }
            questions++;
        }
        System.out.println("You have gotten " + correctGuess + "/10 guesses correct!");
    }
}
