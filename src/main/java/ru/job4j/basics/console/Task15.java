package ru.job4j.basics.console;

/**
 * Demonstrates character repetition from the source string.
 *
 * <p>Example output:
 * <pre>{@code
 * +++
 * !!!!
 * ??}</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String source = "+!?";
        System.out.println(String.valueOf(source.charAt(0)).repeat(3));
        System.out.println(String.valueOf(source.charAt(1)).repeat(4));
        System.out.print(String.valueOf(source.charAt(2)).repeat(2));
    }
}
