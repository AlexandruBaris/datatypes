package game.domain;

public class AskFriendHelpOption {
    private boolean isUsed = false;
    private boolean isInvoked = false;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public boolean isInvoked() {
        return isInvoked;
    }

    public void setInvoked(boolean invoked) {
        isInvoked = invoked;
    }

    public void invoke(Question question) {
        System.out.println("> Friend tells that most probably is this one - " + question.getCorrectAnswer() + " - 99.7%");
        setUsed(true);
        setInvoked(false);
    }
}
