package ru.job4j.basics.branching;

/**
 * Modifies a number based on its sign and prints the result.
 *
 * <p>Example output for {@code number = -6}:
 * <pre>{@code
 * 6
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task30 {

    /**
     * Changes negative to positive, positive to {@code 0},
     * and leaves {@code 0} unchanged.
     *
     * @param number the integer to process
     */
    public static void numModify(int number) {
        if (number < 0) {
            number = Math.abs(number);
        } else if (number > 0) {
            number = 0;
        }
        System.out.println(number);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numModify(-6);
    }
}
