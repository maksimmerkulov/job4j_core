package ru.job4j.basics.branching;

/**
 * Checks if a fraction exists based on its denominator.
 *
 * <p>Example output for {@code num1 = 2} and {@code num2 = 5}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task23 {

    /**
     * Prints {@code "Yes"} if the denominator is not zero,
     * otherwise prints {@code "No"}.
     *
     * @param num1 the numerator
     * @param num2 the denominator
     */
    public static void isExist(int num1, int num2) {
        System.out.println(num2 != 0 ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isExist(2, 5);
    }
}
