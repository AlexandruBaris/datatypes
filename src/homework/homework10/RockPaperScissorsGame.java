package homework.homework10;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";


    public static String getComputerDecision() {
        String computerDecision;
        Random random = new Random();
        int decision = random.nextInt(3) + 1;
        if (decision == 1) {
            computerDecision = ROCK;
        } else if (decision == 2) {
            computerDecision = PAPER;
        } else {
            computerDecision = SCISSORS;
        }
        return computerDecision;
    }


    public static String getUserDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chose Rock, Paper, Scissors: ");
        return scanner.next().toUpperCase();
    }


    public static void startGame() {
        String playerMove = RockPaperScissorsGame.getUserDecision();
        String computerMove = RockPaperScissorsGame.getComputerDecision();
        if (playerMove.equals(computerMove)) {
            System.out.println("Game is Tie !!\nYou chose: " + playerMove + "\nComputer chose : " + computerMove);
            // if playerMove is ROCK
        } else if (playerMove.equals(RockPaperScissorsGame.ROCK)) {
            System.out.println(computerMove.equals(RockPaperScissorsGame.PAPER) ? "Computer Wins" : "Player wins");
            System.out.println("You chose: " + playerMove + "\nComputer chose : " + computerMove);
            // if playerMove is PAPER
        } else if (playerMove.equals(RockPaperScissorsGame.PAPER)) {
            System.out.println(computerMove.equals(RockPaperScissorsGame.SCISSORS) ? "Computer Wins" : "Player wins");
            System.out.println("You chose: " + playerMove + "\nComputer chose : " + computerMove);
            // if playerMove is SCISSORS
        } else if (playerMove.equals(RockPaperScissorsGame.SCISSORS)) {
            System.out.println(computerMove.equals(RockPaperScissorsGame.ROCK) ? "Computer Wins" : "Player wins");
            System.out.println("You chose: " + playerMove + "\nComputer chose : " + computerMove);
        } else {
            System.out.println("Error! Check your answer!");
            startGame();
        }
        replay();
    }


    public static void replay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to replay[Y] or [N] ?: ");
        String restart = scanner.next();
        if (restart.equalsIgnoreCase("Y")) {
            startGame();
        } else if (restart.equalsIgnoreCase("N")) {
            System.out.println("Bye.");
        } else {
            System.out.println("Something went wrong, check your answer.");
            replay();
        }
    }
}
