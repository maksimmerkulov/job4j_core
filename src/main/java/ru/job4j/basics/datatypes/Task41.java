package ru.job4j.basics.datatypes;

/**
 * Performs a circular right shift on a three-digit number.
 *
 * <p>Example output for {@code number = 123}:
 * <pre>{@code
 * 312
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task41 {

    /**
     * Shifts digits of the given number to the right
     * and moves the last digit to the beginning.
     *
     * @param number the three-digit positive integer
     */
    public static void rightCircleShift(int number) {
        int last = number % 10;
        int result = last * 100 + (number / 10);
        System.out.println(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        rightCircleShift(123);
    }
}
