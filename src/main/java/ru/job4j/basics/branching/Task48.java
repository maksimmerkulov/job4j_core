package ru.job4j.basics.branching;

/**
 * Performs calculations based on the parity of the first number.
 *
 * <p>Example output for {@code num1 = 2}, {@code num2 = 2.5}, {@code num3 = 3}:
 * <pre>{@code
 * 5.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task48 {

    /**
     * Calculates and prints either a product or a sum based on {@code num1}.
     *
     * @param num1 the first integer
     * @param num2 the second double
     * @param num3 the third integer
     */
    public static void changeNum(int num1, double num2, int num3) {
        if (num1 % 2 == 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 + num3);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        changeNum(2, 2.5, 3);
    }
}
