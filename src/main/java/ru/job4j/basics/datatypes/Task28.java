package ru.job4j.basics.datatypes;

/**
 * Calculates and prints the sum of digits of a two-digit number.
 *
 * <p>Example output for {@code number = 35}:
 * <pre>{@code
 * 8
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task28 {

    /**
     * Calculates the sum of digits of the given number.
     *
     * @param number the two-digit positive integer
     */
    public static void numSum(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + num2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numSum(35);
    }
}
