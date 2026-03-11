package ru.job4j.basics.datatypes;

/**
 * Performs a circular right shift on a four-digit number.
 *
 * <p>Example output for {@code number = 1234}:
 * <pre>{@code
 * 4123
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task42 {

    /**
     * Shifts digits of the given number to the right
     * and moves the last digit to the beginning.
     *
     * @param number the four-digit positive integer
     */
    public static void rightCircleShift(int number) {
        int last = number % 10;
        int result = last * 1000 + (number / 10);
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        rightCircleShift(1234);
    }
}
