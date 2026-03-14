package ru.job4j.basics.branching;

/**
 * Decreases a three-digit positive number by one and prints the result.
 *
 * <p>Example output for {@code number = 100}:
 * <pre>{@code
 * 99
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18 {

    /**
     * Decreases the number by one if it is positive
     * and has at least three digits, otherwise prints it as is.
     *
     * @param number the integer to process
     */
    public static void numDecrease(int number) {
        if (number >= 100) {
            number--;
        }
        System.out.println(number);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numDecrease(100);
    }
}
