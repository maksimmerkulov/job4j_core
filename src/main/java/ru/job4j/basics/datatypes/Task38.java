package ru.job4j.basics.datatypes;

/**
 * Performs a linear left shift on a four-digit number.
 *
 * <p>Example output for {@code number = 1234}:
 * <pre>{@code
 * 2340
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task38 {

    /**
     * Shifts digits of the given number to the left and appends a zero.
     *
     * @param number the four-digit positive integer
     */
    public static void leftShift(int number) {
        int result = (number % 1000) * 10;
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        leftShift(1234);
    }
}
