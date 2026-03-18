package ru.job4j.basics.branching;

/**
 * Finds and prints the nearest round number to the given one.
 *
 * <p>Example output for {@code number = 553}:
 * <pre>{@code
 * 550
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task44 {

    /**
     * Calculates and prints the nearest round number.
     *
     * @param number the positive integer to process
     */
    public static void getRoundNumber(int number) {
        if (number % 10 < 5) {
            System.out.println(number / 10 * 10);
        } else {
            System.out.println((number / 10 + 1) * 10);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        getRoundNumber(553);
        getRoundNumber(78);
    }
}
