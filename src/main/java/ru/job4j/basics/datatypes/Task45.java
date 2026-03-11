package ru.job4j.basics.datatypes;

/**
 * Swaps the first digits of two three-digit numbers.
 *
 * <p>Example output for {@code number1 = 123} and {@code number2 = 456}:
 * <pre>{@code
 * 423
 * 156
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task45 {

    /**
     * Swaps the first digits of the given two numbers and prints results.
     *
     * @param number1 the first three-digit positive integer
     * @param number2 the second three-digit positive integer
     */
    public static void leftNumChange(int number1, int number2) {
        int first1 = number1 / 100;
        int first2 = number2 / 100;
        int result1 = first2 * 100 + (number1 % 100);
        int result2 = first1 * 100 + (number2 % 100);
        System.out.println(result1);
        System.out.println(result2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        leftNumChange(123, 456);
    }
}
