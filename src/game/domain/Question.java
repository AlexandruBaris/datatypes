package game.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question {
    private final List<Answer> answers;
    private String text;
    private int score;
    private int level;

    public Question(int score, int level, String text, List<Answer> answers) {
        this.answers = answers;
        this.text = text;
        this.level = level;
        this.score = score;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getWrongAnswers() {
        List<Answer> wrongAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if (!answer.isCorrect()) {
                wrongAnswers.add(answer);
            }
        }
        Collections.shuffle(wrongAnswers);
        return wrongAnswers;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                return answer;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answers, score, level, text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return score == question.score && level == question.level && Objects.equals(answers, question.answers) && Objects.equals(text, question.text);
    }

    @Override
    public String toString() {
        return "Question{" +
                "answers=" + answers +
                ", score=" + score +
                ", level=" + level +
                ", text='" + text + '\'' +
                '}';
    }
}
