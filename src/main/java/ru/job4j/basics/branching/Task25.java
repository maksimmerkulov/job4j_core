package ru.job4j.basics.branching;

/**
 * Checks if a number is positive.
 *
 * <p>Example output for {@code number = 1}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task25 {

    /**
     * Prints {@code "Yes"} if the number is greater than {@code 0},
     * otherwise prints {@code "No"}.
     *
     * @param number the integer to check
     */
    public static void isPositive(int number) {
        System.out.println(number > 0 ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isPositive(1);
    }
}
