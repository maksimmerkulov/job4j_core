package ru.job4j.basics.branching;

/**
 * Determines the sign of a number and prints the result.
 *
 * <p>Example output for {@code number = 0}:
 * <pre>{@code
 * Zero
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17 {

    /**
     * Prints the sign of the number.
     *
     * @param number the integer to check
     */
    public static void signCheck(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        signCheck(0);
    }
}
