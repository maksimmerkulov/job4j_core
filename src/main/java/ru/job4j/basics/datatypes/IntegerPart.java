package ru.job4j.basics.datatypes;

/**
 * Demonstrates extracting the integer part of a floating-point number.
 *
 * <p>Example output:
 * <pre>{@code
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerPart {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = (int) floatNum;
        System.out.println(integerNum);
    }
}
