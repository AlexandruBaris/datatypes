package game.domain;

import java.util.List;
import java.util.Random;

public class FiftyFiftyHelpOption {
    private boolean isUsed = false;
    private boolean isInvoked = false;

    public boolean isInvoked() {
        return isInvoked;
    }

    public void setInvoked(boolean invoked) {
        isInvoked = invoked;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void invoke(Question question) {
        List<Answer> wrongAnswers = question.getWrongAnswers();
        Answer wrongAnswer = wrongAnswers.get(new Random().nextInt(wrongAnswers.size()));

        System.out.println("  > Computer says: ");
        System.out.println(wrongAnswer + " - 50%");
        System.out.println(question.getCorrectAnswer() + " - 50%");

        setUsed(true);
        setInvoked(false);
    }
}
