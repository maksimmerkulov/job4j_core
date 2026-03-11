package ru.job4j.basics.datatypes;

/**
 * Swaps the last digits of two positive integers of any length.
 *
 * <p>Example output for {@code number1 = 123} and {@code number2 = 4567}:
 * <pre>{@code
 * 127
 * 4563
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task44 {

    /**
     * Swaps the last digits of the given two numbers and prints results.
     *
     * @param number1 the first positive integer
     * @param number2 the second positive integer
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
        rightNumChange(123, 4567);
    }
}
