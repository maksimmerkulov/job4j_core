package ru.job4j.basics.branching;

/**
 * Checks if a three-digit positive integer contains at least one zero.
 *
 * <p>Example output for {@code number = 407}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task43 {

    /**
     * Prints {@code "Yes"} if the number contains a zero,
     * otherwise prints {@code "No"}.
     *
     * @param number the three-digit positive integer to check
     */
    public static void containsZero(int number) {
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        if (first == 0 || second == 0 || third == 0) {
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
        containsZero(407);
    }
}
