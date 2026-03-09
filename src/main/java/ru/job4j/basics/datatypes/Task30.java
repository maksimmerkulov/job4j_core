package ru.job4j.basics.datatypes;

/**
 * Calculates and prints the absolute difference
 * between tens and units of a number.
 *
 * <p>Example output for {@code number = 25}:
 * <pre>{@code
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task30 {

    /**
     * Calculates the absolute difference between digits of the given number.
     *
     * @param number the two-digit positive integer
     */
    public static void difference(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(Math.abs(num1 - num2));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        difference(25);
    }
}
