package ru.job4j.basics.console;

/**
 * Prints a value and its square to the console.
 *
 * <p>Example output:
 * <pre>{@code
 * Value x is 9
 * Value x^2 is 81
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int x = 9;
        System.out.println("Value x is " + x);
        System.out.println("Value x^2 is " + x * x);
    }
}
