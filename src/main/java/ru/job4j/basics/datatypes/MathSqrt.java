package ru.job4j.basics.datatypes;

/**
 * Demonstrates calculating a square root using
 * the {@link Math#sqrt(double)} method.
 *
 * <p>Example output:
 * <pre>{@code
 * 3.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathSqrt {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        double result = Math.sqrt(9);
        System.out.println(result);
    }
}
