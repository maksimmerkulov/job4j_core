package ru.job4j.basics.datatypes;

/**
 * Separates a two-digit number into individual digits.
 *
 * <p>Example output for {@code number = 20}:
 * <pre>{@code
 * 2 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20 {

    /**
     * Separates the given two-digit number into tens and units.
     *
     * @param number the two-digit positive integer
     */
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + " " + num2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        separate(20);
    }
}
