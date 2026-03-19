package ru.job4j.basics.branching;

/**
 * Finds and prints the largest last digit between two integers.
 *
 * <p>Example output for {@code num1 = 252} and {@code num2 = 76}:
 * <pre>{@code
 * 6
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task50 {

    /**
     * Extracts last digits, compares them and prints the result.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     */
    public static void maxLastDigit(int num1, int num2) {
        int last1 = num1 % 10;
        int last2 = num2 % 10;
        if (last1 == last2) {
            System.out.println("Same");
        } else {
            System.out.println(Math.max(last1, last2));
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        maxLastDigit(252, 76);
    }
}
