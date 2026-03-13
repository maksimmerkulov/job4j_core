package ru.job4j.basics.branching;

/**
 * Calculates the net profit of a game based on winning probability.
 *
 * <p>Example output for {@code percent = 0.2}, {@code prize = 50},
 * and {@code pay = 9}:
 * <pre>{@code
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Game {

    /**
     * Checks the potential profit of the game.
     *
     * @param percent the probability of winning
     * @param prize the total prize amount
     * @param pay the cost of the game
     * @return the net profit if positive, {@code 0} otherwise
     */
    public static int checkGame(double percent, int prize, int pay) {
        double profit = percent * prize - pay;
        return profit > 0 ? (int) profit : 0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(checkGame(0.2, 50, 9));
    }
}
