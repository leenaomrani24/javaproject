package prisoners.players;

public class PeriodiqueTTC extends Player {
    @Override
    public String getName() {
        return "PeriodiqueTTC";
    }

    @Override
    public int play(String opponentName) {
        return (opponentName.equals("PeriodiqueTTC") || opponentName.equals("Rancuniere")) ? 2 : 1; // T, T, C pattern
    }
}

