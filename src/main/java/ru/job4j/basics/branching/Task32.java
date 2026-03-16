package ru.job4j.basics.branching;

/**
 * Calculates the difference or product of two numbers based on their comparison.
 *
 * <p>Example output for {@code num1 = 2} and {@code num2 = 5}:
 * <pre>{@code
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task32 {

    /**
     * Prints the difference if numbers are different,
     * or the product if they are equal.
     *
     * @param num1 the first positive integer
     * @param num2 the second positive integer
     */
    public static void calculate(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else if (num2 > num1) {
            System.out.println(num2 - num1);
        } else {
            System.out.println(num1 * num2);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        calculate(2, 5);
    }
}
