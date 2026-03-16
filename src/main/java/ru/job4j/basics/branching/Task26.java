package ru.job4j.basics.branching;

/**
 * Checks if two numbers are equal.
 *
 * <p>Example output for {@code num1 = 1} and {@code num2 = 1}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task26 {

    /**
     * Prints {@code "Yes"} if numbers are equal, otherwise prints {@code "No"}.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     */
    public static void isEqual(int num1, int num2) {
        System.out.println(num1 == num2 ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isEqual(1, 1);
    }
}
