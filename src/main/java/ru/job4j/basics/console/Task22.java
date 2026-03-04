package ru.job4j.basics.console;

/**
 * Provides a method for printing greeting messages.
 *
 * <p>Example output for {@code name = "Nikolay"}:
 * <pre>{@code
 * Hello, Nikolay!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22 {

    /**
     * Prints a greeting message containing the specified name.
     *
     * @param name the user name
     */
    public static void nameInsert(String name) {
        String result = String.format("Hello, %s!", name);
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        nameInsert("Nikolay");
    }
}
