package ru.job4j.basics.branching;

/**
 * Doubles a positive number and prints the result.
 *
 * <p>Example output for {@code number = 4}:
 * <pre>{@code
 * 8
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15 {

    /**
     * Multiplies the number by {@code 2} if it is positive,
     * otherwise prints it as is.
     *
     * @param number the integer to process
     */
    public static void multiplyByTwo(int number) {
        if (number > 0) {
            number *= 2;
        }
        System.out.println(number);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        multiplyByTwo(4);
    }
}
