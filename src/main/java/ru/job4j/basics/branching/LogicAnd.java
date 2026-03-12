package ru.job4j.basics.branching;

/**
 * Checks if the given number is both positive and even.
 *
 * <p>Example output for {@code num = 2}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicAnd {

    /**
     * Checks if the specified number is positive and even.
     *
     * @param num the integer to check
     * @return {@code true} if the number is greater than zero and even,
     *         {@code false} otherwise
     */
    public static boolean check(int num) {
        return num > 0 && num % 2 == 0;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
