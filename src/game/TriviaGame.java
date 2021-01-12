package game;

import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "";
        boolean gameOver = false;
        int questionNum = 1;
        int questionScore = 0;
        int actualScore = 0;

        System.out.print("\t\t\t\tWelcome to Trivia Game\n\tEnter [START] to start the game or [EXIT] to quit\nWaiting for your decision : ");
        String decision = scanner.nextLine();
        System.out.println();

        if (decision.equalsIgnoreCase("START")) {
            do {
                //System.out.print("///\tYou have 3 help options: H1 - (50/50); H2 - Ask a friend; H3 - Ask auditory\t\\\\\\\n");
                switch (questionNum) {
                    case 1:
                        System.out.println(Questions.LEVEL_1_QUESTION_1);
                        System.out.println(Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_1);
                        System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                        System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                        System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_4);
                        //System.out.println("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_1;
                        questionScore = Questions.LEVEL_1_QUESTION_1_SCORE;
                        break;
                    case 2:
                        System.out.println(Questions.LEVEL_1_QUESTION_2);
                        System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                        System.out.println(Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2);
                        System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                        System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2;
                        questionScore = Questions.LEVEL_1_QUESTION_2_SCORE;
                        break;
                    case 3:
                        System.out.println(Questions.LEVEL_1_QUESTION_3);
                        System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_1);
                        System.out.println(Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_2);
                        System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_3);
                        System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_2;
                        questionScore = Questions.LEVEL_1_QUESTION_3_SCORE;
                        break;
                    case 4:
                        System.out.println(Questions.LEVEL_2_QUESTION_1);
                        System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                        System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                        System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_3);
                        System.out.println(Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_4;
                        questionScore = Questions.LEVEL_2_QUESTION_1_SCORE;
                        break;
                    case 5:
                        System.out.println(Questions.LEVEL_2_QUESTION_2);
                        System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_1);
                        System.out.println(Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_2);
                        System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_3);
                        System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_2;
                        questionScore = Questions.LEVEL_2_QUESTION_2_SCORE;
                        break;
                    case 6:
                        System.out.println(Questions.LEVEL_2_QUESTION_3);
                        System.out.println(Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_1);
                        System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_2);
                        System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_3);
                        System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_1;
                        questionScore = Questions.LEVEL_2_QUESTION_3_SCORE;
                        break;
                    case 7:
                        System.out.println(Questions.LEVEL_3_QUESTION_1);
                        System.out.println(Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1);
                        System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                        System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                        System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1;
                        questionScore = Questions.LEVEL_3_QUESTION_1_SCORE;
                        break;
                    case 8:
                        System.out.println(Questions.LEVEL_3_QUESTION_2);
                        System.out.println(Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_1);
                        System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_2);
                        System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_3);
                        System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_4);
                        System.out.print("\nAnswer: ");
                        correctAnswer = Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_1;
                        questionScore = Questions.LEVEL_3_QUESTION_2_SCORE;
                        break;
                    case 9:
                        System.out.println(Questions.LEVEL_3_QUESTION_3);
                        System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_1);
                        System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_2);
                        System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_3);
                        System.out.println(Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4);
                        System.out.print("Answer: ");
                        correctAnswer = Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4;
                        questionScore = Questions.LEVEL_3_QUESTION_3_SCORE;
                        break;
                }
                System.out.print("///\tYou have 3 help options: H1 - (50/50); H2 - Ask a friend; H3 - Ask auditory\t\\\\\\\n");
                System.out.print("Answer: ");
                String response = scanner.nextLine();


                if (correctAnswer.equalsIgnoreCase(response)) {
                    questionNum++;
                    actualScore += questionScore;
                    System.out.println("Correct! Current Score: " + actualScore + "\n");
                } else {
                    gameOver = true;
                    System.out.print("Game Over");
                }
                if (questionNum > 9) {
                    gameOver = true;
                    System.out.println("The End. You Won!\nYour Score: " + actualScore);
                }
            } while (!gameOver);
        } else if (decision.equalsIgnoreCase("EXIT")) System.out.println("See you soon.");
    }
}

// 50:50   friend call 100%  auditory help