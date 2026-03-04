package ru.job4j.basics.console;

/**
 * Calculates and prints two variables, their sum, and product.
 *
 * <p>Example output for {@code x = 3} and {@code y = 5}:
 * <pre>{@code
 * Variables: 3 5
 * Sum: 8
 * Product: 15
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20 {

    /**
     * Prints variables, their sum, and product to the console.
     *
     * @param x the first variable
     * @param y the second variable
     */
    public static void print(int x, int y) {
        System.out.println("Variables: " + x + " " + y);
        System.out.println("Sum: " + (x + y));
        System.out.println("Product: " + (x * y));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        print(3, 5);
    }
}
