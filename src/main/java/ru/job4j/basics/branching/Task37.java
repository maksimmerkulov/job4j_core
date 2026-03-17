package ru.job4j.basics.branching;

/**
 * Checks if the first digit of a two-digit number is greater than the second.
 *
 * <p>Example output for {@code number = 11}:
 * <pre>{@code
 * No
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task37 {

    /**
     * Prints {@code "Yes"} if the first digit is greater than the second,
     * otherwise prints {@code "No"}.
     *
     * @param number the two-digit positive integer to check
     */
    public static void numsCompare(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first > second) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numsCompare(11);
    }
}
