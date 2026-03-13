package ru.job4j.basics.branching;

/**
 * Calculates the total number of coffee cups including bonuses.
 *
 * <p>Example output for {@code count = 7} and {@code n = 6}:
 * <pre>{@code
 * 8
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class BonusCupCoffee {

    /**
     * Calculates the total cups of coffee.
     *
     * @param count the number of paid cups
     * @param n the number of cups required for a bonus
     * @return the total number of cups (paid + bonuses)
     */
    public static int countCup(int count, int n) {
        return count + count / n;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(countCup(7, 6));
    }
}
