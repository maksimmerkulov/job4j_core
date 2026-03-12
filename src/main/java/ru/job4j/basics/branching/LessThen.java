package ru.job4j.basics.branching;

/**
 * Checks if the first number is less than the second one.
 *
 * <p>Example output for {@code first = 1} and {@code second = 2}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LessThen {

    /**
     * Checks if the first number is less than the second.
     *
     * @param first the first integer
     * @param second the second integer
     * @return {@code true} if first is less than second,
     *         {@code false} otherwise
     */
    public static boolean check(int first, int second) {
        return first < second;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(check(1, 2));
    }
}
