package ru.job4j.basics.branching;

/**
 * Checks if a three-digit number is "double even".
 *
 * <p>A number is double even if the number itself
 * and the sum of its digits are both even.
 *
 * <p>Example output for {@code number = 336}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task40 {

    /**
     * Prints {@code "Yes"} if the number is double even,
     * otherwise prints {@code "No"}.
     *
     * @param number the three-digit positive integer to check
     */
    public static void isDoubleEven(int number) {
        int sum = number / 100 + (number / 10) % 10 + number % 10;
        if (number % 2 + sum % 2 == 0) {
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
        isDoubleEven(336);
    }
}
