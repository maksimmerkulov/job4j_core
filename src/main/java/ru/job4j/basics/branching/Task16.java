package ru.job4j.basics.branching;

/**
 * Checks if a number is {@code 0} and prints the result.
 *
 * <p>Example output for {@code number = 0}:
 * <pre>{@code
 * Zero
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16 {

    /**
     * Prints {@code "Zero"} if the number is {@code 0},
     * otherwise prints {@code "Not zero"}.
     *
     * @param number the integer to check
     */
    public static void zeroCheck(int number) {
        System.out.println(number == 0 ? "Zero" : "Not zero");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        zeroCheck(0);
    }
}
