package game.engine;

import game.domain.*;
import game.repository.QuestionRepository;
import game.service.QuestionService;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    private final QuestionService questionService = new QuestionService(new QuestionRepository());
    private AskAudienceHelpOption askAudienceHelpOption = new AskAudienceHelpOption();
    private AskFriendHelpOption askFriendHelpOption = new AskFriendHelpOption();
    private FiftyFiftyHelpOption fiftyFiftyHelpOption = new FiftyFiftyHelpOption();
    private Question currentQuestion;
    private int currentScore;
    private int numberOfHelpOptionsAvailable;
    private int questionLevel;
    private boolean gameOver;

    public TriviaGame() {
        initializeGame();
    }

    public void startGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\tWelcome to Trivia Game");
        do {
            displayHelpOptionsMessage();
            pickQuestion();

            System.out.print("answer > ");
            String userAnswer = scanner.nextLine();

            validateResponse(userAnswer);

            if (questionLevel >= 4)
                endGameWithCongratulations();

        } while (!gameOver);
    }

    private void displayHelpOptionsMessage() {
        System.out.println(" //You have  " + numberOfHelpOptionsAvailable + " help options ( ASK a Friend - [H1], ASK Auditory - [H2], 50/50 - [H3])");
    }

    private void initializeGame() {
        gameOver = false;

        questionLevel = 1;
        currentQuestion = null;
        currentScore = 0;
        numberOfHelpOptionsAvailable = 3;

        askAudienceHelpOption = new AskAudienceHelpOption();
        askFriendHelpOption = new AskFriendHelpOption();
        fiftyFiftyHelpOption = new FiftyFiftyHelpOption();

    }

    private void pickQuestion() {
        List<Question> questionsByLevel = questionService.getQuestionsByLevel(questionLevel);
        int randomIndex = new Random().nextInt(questionsByLevel.size());
        displayQuestion(questionsByLevel.get(randomIndex));
    }

    private void displayQuestion(Question question) {
        if (askFriendHelpOption.isInvoked()) {
            askFriendHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else if (askAudienceHelpOption.isInvoked()) {
            askAudienceHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else if (fiftyFiftyHelpOption.isInvoked()) {
            fiftyFiftyHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else {
            System.out.println(" " + questionLevel + ". " + question.getText());
            List<Answer> answers = question.getAnswers();
            for (Answer answer : answers) {
                System.out.println(" " + answer);
            }
        }

        currentQuestion = question;
    }

    private void validateResponse(String questionResponse) {
        if (questionResponse.equalsIgnoreCase(currentQuestion.getCorrectAnswer().getLetter())) {
            questionLevel++;
            currentScore += currentQuestion.getScore();
            System.out.println("Correct! Current score : " + currentScore);
        } else if (questionResponse.equalsIgnoreCase("H1") && !askFriendHelpOption.isUsed()) {
            askFriendHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H2") && !askAudienceHelpOption.isUsed()) {
            askAudienceHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H3") && !fiftyFiftyHelpOption.isUsed()) {
            fiftyFiftyHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H1") || questionResponse.equalsIgnoreCase("H2") || questionResponse.equalsIgnoreCase("H3")) {
            System.out.println("You`ve used all of your help options, now please respond.");
        } else {
            System.out.println("Game Over!");
            gameOver = true;
        }
    }

    private void endGameWithCongratulations() {
        System.out.println("You won!");
        System.out.println("You got : " + currentScore);
        gameOver = true;
    }

}
