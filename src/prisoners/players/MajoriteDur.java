package prisoners.players;

public class MajoriteDur extends Player {
    private int cooperationCount = 0;
    private int betrayalCount = 0;

    @Override
    public String getName() {
        return "MajoriteDur";
    }

    @Override
    public int play(String opponentName) {
        if (betrayalCount >= cooperationCount) {
            return 2; // Betray as long as betrayal count is equal or more than cooperation count
        } else {
            return 1; // Otherwise cooperate
        }
    }

    public void updateOpponentAction(int action) {
        if (action == 1) {
            cooperationCount++;
        } else {
            betrayalCount++;
        }
    }
}

