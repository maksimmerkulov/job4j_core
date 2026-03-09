package ru.job4j.basics.datatypes;

/**
 * Reverses the digits of a three-digit number and transforms it.
 *
 * <p>Example output for {@code number = 327}:
 * <pre>{@code
 * 703
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task27 {

    /**
     * Reverses the digits of the given number and subtracts {@code 20}.
     *
     * @param number the three-digit positive integer
     */
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println((num3 * 100) + (num2 * 10) + num1 - 20);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        transform(327);
    }
}
