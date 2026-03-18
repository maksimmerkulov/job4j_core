package ru.job4j.basics.branching;

/**
 * Checks if a four-digit number is "pair symmetric".
 *
 * <p>A number is pair symmetric if its first two digits
 * and last two digits form the same number.
 *
 * <p>Example output for {@code number = 4040}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task42 {

    /**
     * Prints {@code "Yes"} if the number is pair symmetric,
     * otherwise prints {@code "No"}.
     *
     * @param number the four-digit positive integer to check
     */
    public static void isPairSymmetric(int number) {
        if (number / 100 == number % 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isPairSymmetric(4040);
    }
}
