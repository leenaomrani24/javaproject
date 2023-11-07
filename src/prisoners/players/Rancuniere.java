package prisoners.players;

public class Rancuniere extends Player {
    private boolean opponentCooperated = true;

    @Override
    public String getName() {
        return "Rancuniere";
    }

    @Override
    public int play(String opponentName) {
        if (opponentName.equals("Rancuniere")) {
            return 1; // Cooperation on the first round
        } else {
            return (opponentCooperated) ? 1 : 2; // Cooperate if opponent cooperated last; otherwise, betray
        }
    }

    public void updateOpponentAction(int action) {
        opponentCooperated = (action == 1); // Update based on the opponent's action
    }
}