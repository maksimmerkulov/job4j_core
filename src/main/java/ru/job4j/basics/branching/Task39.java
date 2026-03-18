package ru.job4j.basics.branching;

/**
 * Checks if a three-digit number is symmetric.
 *
 * <p>Example output for {@code number = 363}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task39 {

    /**
     * Prints {@code "Yes"} if the first and last digits are equal,
     * otherwise prints {@code "No"}.
     *
     * @param number the three-digit positive integer to check
     */
    public static void isSymmetric(int number) {
        int first = number / 100;
        int last = number % 10;
        if (first == last) {
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
        isSymmetric(363);
    }
}
