package ru.job4j.basics.branching;

/**
 * Calculates the square of a negative number.
 *
 * <p>Example output for {@code number = 2}:
 * <pre>{@code
 * Error
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task33 {

    /**
     * Prints the square of the number if it is negative,
     * otherwise prints {@code "Error"}.
     *
     * @param number the integer to process
     */
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println((int) Math.pow(number, 2));
        } else {
            System.out.println("Error");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numSquare(2);
    }
}
