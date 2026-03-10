package ru.job4j.basics.datatypes;

/**
 * Performs a circular left shift on a three-digit number.
 *
 * <p>Example output for {@code number = 123}:
 * <pre>{@code
 * 231
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task39 {

    /**
     * Shifts digits of the given number to the left
     * and moves the first digit to the end.
     *
     * @param number the three-digit positive integer
     */
    public static void leftCircleShift(int number) {
        int first = number / 100;
        int result = (number % 100) * 10 + first;
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        leftCircleShift(123);
    }
}
