package ru.job4j.basics.branching;

/**
 * Checks if the first number is greater than the second one.
 *
 * <p>Example output for {@code first = 10} and {@code second = 2}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class GreatThen {

    /**
     * Checks if the first number is greater than the second.
     *
     * @param first the first integer
     * @param second the second integer
     * @return {@code true} if first is greater than second,
     *         {@code false} otherwise
     */
    public static boolean check(int first, int second) {
        return first > second;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(check(10, 2));
    }
}
