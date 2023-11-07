package prisoners.players;
public class Random extends Player {
	public String getName() {
		return "random";
	}
	public int play(String opponentName) {
		return (int)(Math.random() + 1);
	}
}
