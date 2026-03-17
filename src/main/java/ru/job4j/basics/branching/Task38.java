package ru.job4j.basics.branching;

/**
 * Finds and prints the largest digit of a two-digit number.
 *
 * <p>Example output for {@code number = 37}:
 * <pre>{@code
 * 7
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task38 {

    /**
     * Prints the maximum digit or a message if they are equal.
     *
     * @param number the two-digit positive integer to check
     */
    public static void maxDigit(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first > second) {
            System.out.println(first);
        } else if (second > first) {
            System.out.println(second);
        } else {
            System.out.println("Equal");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        maxDigit(37);
    }
}
