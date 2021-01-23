package homework13;

import java.util.Random;

public class DiceGame {
    public static void main(String... args) {
        int playerWin = 0, pcWin = 0, counter = 0;

        while (counter < 10) {
            counter++;
            if (pcDice() < playerDice()) {
                playerWin++;
            } else if (pcDice() == playerDice()) {
                counter--;
            } else {
                pcWin++;
            }
        }

        if (playerWin < pcWin) {
            System.out.println("Computer wins with the score: " + pcWin + "/" + playerWin);
        } else {
            System.out.println("Player wins with the score: " + playerWin + "/" + pcWin);
        }
    }

    private static int pcDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int playerDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
