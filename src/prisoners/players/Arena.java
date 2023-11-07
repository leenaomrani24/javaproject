package prisoners;

import prisoners.players.*;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Player> strategies;

    public Arena() {
        this.strategies = new ArrayList<>();
    }

    public void addStrategy(Player strategy) {
        this.strategies.add(strategy);
    }

    public void competeAll() {
        for (int i = 0; i < strategies.size(); i++) {
            for (int j = i + 1; j < strategies.size(); j++) {
                GameExample game = new GameExample(strategies.get(i), strategies.get(j));
                System.out.println("Strategy 1: " + strategies.get(i).getName() + " vs. Strategy 2: " + strategies.get(j).getName());
                game.play();
            }
        }
    }

    // Run multiple generations
    public void runGenerations(int numGenerations) {
        for (int gen = 0; gen < numGenerations; gen++) {
            System.out.println("Generation " + (gen + 1) + " results:");
            competeAll();
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {
        Arena arena = new Arena();

        // Add instances of all strategies to the arena
        arena.addStrategy(new Collaborator());
        arena.addStrategy(new Denouncer());
        arena.addStrategy(new Rancuniere());
        arena.addStrategy(new MajoriteMou());
        arena.addStrategy(new MajoriteDur());
        arena.addStrategy(new Pavlov());
        arena.addStrategy(new PeriodiqueTTC());
        // Add instances for all other strategies here

        // Run competitions for multiple generations
        arena.runGenerations(3); // Run for 3 generations as an example
    }
}

