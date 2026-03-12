package ru.job4j.basics.branching;

/**
 * Checks if the given number is negative or odd.
 *
 * <p>Example output for {@code num = 1}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicOr {

    /**
     * Checks if the specified number is negative or odd.
     *
     * @param num the integer to check
     * @return {@code true} if the number is less than zero or odd,
     *         {@code false} otherwise
     */
    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(check(1));
    }
}
