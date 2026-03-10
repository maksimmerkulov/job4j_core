package ru.job4j.basics.datatypes;

/**
 * Swaps the first and last digits of a four-digit number.
 *
 * <p>Example output for {@code number = 4265}:
 * <pre>{@code
 * 5264
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task36 {

    /**
     * Swaps the first and last digits of the given number.
     *
     * @param number the four-digit positive integer
     */
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = (number % 1000) / 10;
        last = number % 10;
        System.out.println(last * 1000 + middle * 10 + first);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        firstLastChange(4265);
    }
}
