package ru.job4j.basics.datatypes;

/**
 * Counts the number of even digits in a two-digit positive integer.
 *
 * <p>Example output for {@code number = 64}:
 * <pre>{@code
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task32 {

    /**
     * Calculates and prints the amount of even digits.
     *
     * @param number the two-digit positive integer to process
     */
    public static void evenAmount(int number) {
        int num1, num2, counter = 0;
        num1 = number / 10;
        num2 = number % 10;
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        evenAmount(64);
    }
}
