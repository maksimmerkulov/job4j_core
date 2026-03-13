package ru.job4j.basics.branching;

/**
 * Demonstrates the short-circuit behavior of logical operators.
 *
 * <p>Example output:
 * <pre>{@code
 * A
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortCircuitAnd {

    /**
     * Prints {@code A} and returns {@code false}.
     *
     * @return always {@code false}
     */
    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    /**
     * Prints {@code B} and returns {@code false}.
     *
     * @return always {@code false}
     */
    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        if (showA() && showB()) {
            System.out.println("This message will never be displayed");
        }
    }
}
