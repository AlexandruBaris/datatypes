package game.domain;

public class Question {
    public static String[] questions = {"Where was born Nikola Tesla?",
            "Who was Ludovico Einaudi?",
            "Who cut off his ear?"};
    public static String[] answersQ1 = {"Croatia", "Germany", "Sweden", "France"};
    String[] answersQ2 = {"Author/Philanthropist", "Pianist", "Soccer player", "Actor"};

    public static void displayQuestion(int questionNumber) {
        System.out.println(questions[questionNumber]);
    }

    public static void displayAnswer() {
        for (int i = 0; i < answersQ1.length; i++) {
            System.out.println(answersQ1[i]);
        }
    }
}
