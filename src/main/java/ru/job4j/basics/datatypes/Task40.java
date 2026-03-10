package ru.job4j.basics.datatypes;

/**
 * Performs a circular left shift on a four-digit number.
 *
 * <p>Example output for {@code number = 1234}:
 * <pre>{@code
 * 2341
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task40 {

    /**
     * Shifts digits of the given number to the left
     * and moves the first digit to the end.
     *
     * @param number the four-digit positive integer
     */
    public static void leftCircleShift(int number) {
        int first = number / 1000;
        int result = (number % 1000) * 10 + first;
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        leftCircleShift(1234);
    }
}
