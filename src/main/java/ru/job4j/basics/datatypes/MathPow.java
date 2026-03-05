package ru.job4j.basics.datatypes;

/**
 * Demonstrates exponentiation using
 * the {@link Math#pow(double, double)} method.
 *
 * <p>Example output:
 * <pre>{@code
 * 9.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathPow {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        double result = Math.pow(3, 2);
        System.out.println(result);
    }
}
