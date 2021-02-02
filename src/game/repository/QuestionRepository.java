package game.repository;

import game.domain.Answer;
import game.domain.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
    public List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question(250, 1, "Where was born Nikola Tesla?",
                    Arrays.asList(new Answer("Croatia", true, "A"), new Answer("Germany", false, "B"),
                            new Answer("Sweden", false, "C"), new Answer("France", false, "D"))),

            new Question(300, 1, "Who was Ludovico Einaudi?",
                    Arrays.asList(new Answer("Actor", false, "A"), new Answer("Soccer player", false, "B"),
                            new Answer("Author", false, "C"), new Answer("Pianist", true, "D"))),

            new Question(200, 1, "which artist cut off his ear?",
                    Arrays.asList(new Answer("Rafael", false, "A"), new Answer("Van Gogh", true, "B"),
                            new Answer("Picasso", false, "C"), new Answer("Michelangelo", false, "D"))),

            new Question(100, 2, "Who wore national anthem of Moldova?",
                    Arrays.asList(new Answer("Mihai Eminescu", false, "A"), new Answer("Alexei Mateevici", true, "B"),
                            new Answer("Ion Creanga", false, "C"), new Answer("Alexandru Cristea", false, "D"))),

            new Question(100, 2, "Which company is developing java?",
                    Arrays.asList(new Answer("Apple", false, "A"), new Answer("IBM", false, "B"),
                            new Answer("Oracle", true, "C"), new Answer("IBM", false, "D"))),

            new Question(300, 2, "When was the Eiffel Tower built?",
                    Arrays.asList(new Answer("1887", true, "A"), new Answer("1977", false, "B"),
                            new Answer("1885", false, "C"), new Answer("1935", false, "D"))),

            new Question(200, 3, "How many muscles are in the human body?",
                    Arrays.asList(new Answer("600", false, "A"), new Answer("less then 600", false, "B"),
                            new Answer("more than 600", true, "C"), new Answer("643", false, "D"))),

            new Question(250, 3, "Which is the formula of Vodka?",
                    Arrays.asList(new Answer("C2H5OH", true, "A"), new Answer("H20", false, "B"),
                            new Answer("CA3O2", false, "C"), new Answer("C2H4P5", false, "D"))),

            new Question(300, 3, "Which is the second highest peak in the world?",
                    Arrays.asList(new Answer("Everest", false, "A"), new Answer("K2", true, "B"),
                            new Answer("Lhotse", false, "C"), new Answer("Annapurna", false, "D")))));

    public List<Question> findQuestionsByLevel(int level) {
        List<Question> result = new ArrayList<>();
        for (int i = 0, j = 0; i < questions.size(); i++) {
            if (questions.get(i).getLevel() == level)
                result.add(questions.get(i));
        }
        return result;
    }
}
