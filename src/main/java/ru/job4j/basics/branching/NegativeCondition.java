package ru.job4j.basics.branching;

/**
 * Demonstrates basic logical conditions for negative and positive numbers.
 *
 * <p>Example output:
 * <pre>{@code
 * true
 * false
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NegativeCondition {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int num = -1;
        boolean result1 = num < 0;
        boolean result2 = num > 0;
        System.out.println(result1);
        System.out.println(result2);
    }
}
