package ru.job4j.basics.datatypes;

/**
 * Swaps the last digits of two three-digit numbers.
 *
 * <p>Example output for {@code number1 = 123} and {@code number2 = 456}:
 * <pre>{@code
 * 126
 * 453
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task43 {

    /**
     * Swaps the last digits of the given two numbers and prints results.
     *
     * @param number1 the first three-digit positive integer
     * @param number2 the second three-digit positive integer
     */
    public static void rightNumChange(int number1, int number2) {
        int last1 = number1 % 10;
        int last2 = number2 % 10;
        int result1 = (number1 / 10) * 10 + last2;
        int result2 = (number2 / 10) * 10 + last1;
        System.out.println(result1);
        System.out.println(result2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}
