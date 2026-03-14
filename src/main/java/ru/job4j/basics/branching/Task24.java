package ru.job4j.basics.branching;

/**
 * Checks if a fraction is positive.
 *
 * <p>Example output for {@code num1 = -1} and {@code num2 = -5}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task24 {

    /**
     * Prints {@code "Yes"} if the fraction is greater than {@code 0},
     * otherwise prints {@code "No"}.
     *
     * @param num1 the numerator
     * @param num2 the denominator; assumed to be non-zero
     */
    public static void isPositive(int num1, int num2) {
        if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)) {
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
        isPositive(-1, -5);
    }
}
