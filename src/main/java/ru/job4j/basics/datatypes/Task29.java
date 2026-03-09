package ru.job4j.basics.datatypes;

/**
 * Calculates and prints the sum of digits of a three-digit number.
 *
 * <p>Example output for {@code number = 325}:
 * <pre>{@code
 * 10
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task29 {

    /**
     * Calculates the sum of digits of the given number.
     *
     * @param number the three-digit positive integer
     */
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num1 + num2 + num3);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numSum(325);
    }
}
