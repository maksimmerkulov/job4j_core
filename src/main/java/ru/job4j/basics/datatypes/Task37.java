package ru.job4j.basics.datatypes;

/**
 * Performs a linear left shift on a three-digit number.
 *
 * <p>Example output for {@code number = 123}:
 * <pre>{@code
 * 230
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task37 {

    /**
     * Shifts digits of the given number to the left and appends a zero.
     *
     * @param number the three-digit positive integer
     */
    public static void leftShift(int number) {
        int result = (number % 100) * 10;
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        leftShift(123);
    }
}
