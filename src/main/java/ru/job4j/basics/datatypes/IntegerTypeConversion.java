package ru.job4j.basics.datatypes;

/**
 * Demonstrates implicit and explicit integer type conversion.
 *
 * <p>Example output:
 * <pre>{@code
 * 1
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerTypeConversion {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) num;
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}
