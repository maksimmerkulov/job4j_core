package ru.job4j.basics.branching;

/**
 * Compares two numbers and prints their sum, product, or an equality message.
 *
 * <p>Example output for {@code number1 = 10} and {@code number2 = 9}:
 * <pre>{@code
 * 19
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19 {

    /**
     * Prints the sum if the first number is greater,
     * the product if the second is greater, or a message if they are equal.
     *
     * @param number1 the first integer
     * @param number2 the second integer
     */
    public static void sumOrMultiply(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + number2);
        } else if (number2 > number1) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Numbers are equal");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        sumOrMultiply(10, 9);
    }
}
