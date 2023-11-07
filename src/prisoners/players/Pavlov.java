package prisoners.players;

public class Pavlov extends Player {
    private boolean sameAsLast = true;

    @Override
    public String getName() {
        return "Pavlov";
    }

    @Override
    public int play(String opponentName) {
        boolean play = sameAsLast;
        sameAsLast = play == (opponentName.equals("Pavlov") || opponentName.equals("Rancuniere")); // Flip if opponents didn't play the same
        return play ? 1 : 2;
    }
}

