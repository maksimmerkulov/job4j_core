package ru.job4j.basics.branching;

/**
 * Compares two numbers and prints them in ascending and descending order.
 *
 * <p>Example output for {@code num1 = 2} and {@code num2 = -1}:
 * <pre>{@code
 * -1 2
 * 2 -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task31 {

    /**
     * Prints numbers in ascending order in the first line
     * and descending in the second.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     */
    public static void numCompare(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + " " + num2);
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num2 + " " + num1);
            System.out.println(num1 + " " + num2);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        numCompare(2, -1);
    }
}
