package ru.job4j.basics.datatypes;

/**
 * Demonstrates integer division and the modulo operator.
 *
 * <p>Example output:
 * <pre>{@code
 * 3
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DivMod {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int num = 11;
        int div = num / 3;
        int mod = num % 3;
        System.out.println(div);
        System.out.println(mod);
    }
}
