package game.demo;

import game.engine.TriviaAdmin;
import game.engine.TriviaGame;

import java.util.Scanner;

public class GameDemo {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuRunning = true;

        do {
            System.out.print("Enter [START] to start the game or [EXIT] to quit\nWaiting for your decision : ");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("START")) {
                new TriviaGame().startGame();
            } else if (decision.equalsIgnoreCase("ADMIN")) {
                new TriviaAdmin().start();
            } else if (decision.equalsIgnoreCase("EXIT")) {
                menuRunning = false;
            } else {
                System.out.println("Enter [START] to start the game or [EXIT] to quit\nWaiting for your decision : ");
                decision = scanner.nextLine();
            }
        } while (menuRunning);
    }
}
