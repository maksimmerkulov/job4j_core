package ru.job4j.basics.datatypes;

/**
 * Reverses the digits of a two-digit number and transforms it.
 *
 * <p>Example output for {@code number = 37}:
 * <pre>{@code
 * 81
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task26 {

    /**
     * Reverses the digits of the given number and adds {@code 8}.
     *
     * @param number the two-digit positive integer
     */
    public static void transform(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println((num2 * 10) + num1 + 8);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        transform(37);
    }
}
