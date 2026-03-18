package ru.job4j.basics.branching;

/**
 * Changes a positive integer to the nearest round number based on parity.
 *
 * <p>Example output for {@code number = 459}:
 * <pre>{@code
 * Decreased to 450
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task45 {

    /**
     * Modifies and prints the round version of the number.
     *
     * @param number the positive integer to process
     */
    public static void changeToRoundNum(int number) {
        if (number % 10 == 0) {
            System.out.println("No changes");
        } else if (number % 2 == 0) {
            int rounded = (number / 10 + 1) * 10;
            System.out.println("Increased to " + rounded);
        } else {
            int rounded = (number / 10) * 10;
            System.out.println("Decreased to " + rounded);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        changeToRoundNum(459);
    }
}
