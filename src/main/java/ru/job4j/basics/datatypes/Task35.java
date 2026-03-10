package ru.job4j.basics.datatypes;

/**
 * Swaps the first and last digits of a three-digit number.
 *
 * <p>Example output for {@code number = 125}:
 * <pre>{@code
 * 521
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task35 {

    /**
     * Swaps the first and last digits of the given number.
     *
     * @param number the three-digit positive integer
     */
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num3 * 100 + num2 * 10 + num1);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        firstLastChange(125);
    }
}
