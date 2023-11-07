package prisoners;

import prisoners.players.*;

import java.util.ArrayList;
import java.util.List;

public class GameExample {
	protected Player player1;
	protected Player player2;

	public GameExample(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		double[] result = Game.play(this.player1, this.player2);
		System.out.println("Player 1 Score: " + result[0]);
		System.out.println("Player 2 Score: " + result[1]);
		System.out.println("------------");
	}

	public static void main(String[] args) {
		List<Player> strategies = new ArrayList<>();
		strategies.add(new Collaborator());
		strategies.add(new Denouncer());
		strategies.add(new Rancuniere());
		strategies.add(new MajoriteMou());
		strategies.add(new MajoriteDur());
		strategies.add(new Pavlov());
		strategies.add(new PeriodiqueTTC());

		for (int i = 0; i < strategies.size(); i++) {
			for (int j = i + 1; j < strategies.size(); j++) {
				GameExample game = new GameExample(strategies.get(i), strategies.get(j));
				System.out.println("Strategy 1: " + strategies.get(i).getName() + " vs. Strategy 2: " + strategies.get(j).getName());
				game.play();
			}
		}
	}
}
