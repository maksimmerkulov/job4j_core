package ru.job4j.basics.branching;

/**
 * Demonstrates the importance of curly braces in conditional statements.
 *
 * <p>Example output for {@code num = 2}:
 * <pre>{@code
 * A
 * B
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IfBracket {

    /** Displays the character A. */
    public static void showA() {
        System.out.println("A");
    }

    /** Displays the character B. */
    public static void showB() {
        System.out.println("B");
    }

    /**
     * Executes both display methods only if the condition is met.
     *
     * @param num the integer to check
     */
    public static void show(int num) {
        if (num > 1) {
            showA();
            showB();
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        show(2);
    }
}
