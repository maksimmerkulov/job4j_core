package ru.job4j.basics.datatypes;

/**
 * Calculates and prints the absolute result of digit-based operations.
 *
 * <p>Example output for {@code number = 235}:
 * <pre>{@code
 * 9
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task31 {

    /**
     * Calculates the absolute difference between hundreds and units,
     * multiplied by tens.
     *
     * @param number the three-digit positive integer
     */
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(Math.abs((num1 - num3) * num2));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        difference(235);
    }
}
