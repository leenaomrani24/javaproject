package prisoners;
import prisoners.players.Player;
public class Game {
	public static final int COLLABORATE = 1;
	public static final int DENOUNCE = 2;
	public static double[] play(Player player1, Player player2) {
		switch (player1.play(player2.getName())) {
			case Game.COLLABORATE:
				switch (player2.play(player1.getName())) {
					case Game.COLLABORATE:
						return new double[]{0.9, 0.9};
					case Game.DENOUNCE:
						return new double[]{0.2, 1};
					default:
						return new double[]{0, 1};
				}						
			case Game.DENOUNCE:
				switch (player2.play(player1.getName())) {
					case Game.COLLABORATE:
						return new double[]{1, 0.2};
					case Game.DENOUNCE:
						return new double[]{0.5, 0.5};
					default:
						return new double[]{0, 1};
				}
			default:
				return new double[]{1, 0};
		}
	}
}
