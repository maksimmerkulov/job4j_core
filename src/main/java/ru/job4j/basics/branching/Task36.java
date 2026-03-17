package ru.job4j.basics.branching;

/**
 * Checks if a two-digit number consists of identical digits.
 *
 * <p>Example output for {@code number = 33}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task36 {

    /**
     * Prints {@code "Yes"} if digits are the same,
     * otherwise prints {@code "No"}.
     *
     * @param number the two-digit positive integer to check
     */
    public static void sameNums(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first == second) {
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
        sameNums(33);
    }
}
