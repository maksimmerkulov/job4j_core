package ru.job4j.basics.console;

/**
 * Prints a number and its powers to the console.
 *
 * <p>Example output:
 * <pre>{@code
 * 6
 * 36
 * 216
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}
