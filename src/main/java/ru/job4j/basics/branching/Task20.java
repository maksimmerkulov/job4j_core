package ru.job4j.basics.branching;

/**
 * Checks if a three-digit number is "even-beautiful".
 *
 * <p>A number is "even-beautiful" if all its digits are even.
 *
 * <p>Example output for {@code number = 246}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20 {

    /**
     * Prints {@code "Yes"} if all digits are even,
     * otherwise prints {@code "No"}.
     *
     * @param number the three-digit integer to check
     */
    public static void numCheck(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        if ((first % 2 + second % 2 + third % 2) == 0) {
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
        numCheck(246);
    }
}
