package prisoners.players;

public class MajoriteMou extends Player {
    private int cooperationCount = 0;
    private int betrayalCount = 0;

    @Override
    public String getName() {
        return "MajoriteMou";
    }

    @Override
    public int play(String opponentName) {
        if (cooperationCount >= betrayalCount) {
            return 1; // Cooperate as long as cooperation count is equal or more than betrayal count
        } else {
            return 2; // Otherwise betray
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


