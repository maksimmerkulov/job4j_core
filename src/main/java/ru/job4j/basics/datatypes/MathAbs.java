package ru.job4j.basics.datatypes;

/**
 * Demonstrates calculating an absolute value using
 * the {@link Math#abs(double)} method.
 *
 * <p>Example output:
 * <pre>{@code
 * 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathAbs {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        double result = Math.abs(-5);
        System.out.println(result);
    }
}
