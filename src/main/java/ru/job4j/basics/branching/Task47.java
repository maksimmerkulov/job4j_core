package ru.job4j.basics.branching;

/**
 * Modifies a three-digit integer based on its value.
 *
 * <p>Example output for {@code 591}:
 * <pre>{@code
 * 195
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task47 {

    /**
     * Reorders digits and prints the result.
     *
     * @param number the three-digit positive integer
     */
    public static void changeNum(int number) {
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        if (number > 500) {
            System.out.println(third * 100 + second * 10 + first);
        } else {
            System.out.println(first * 100 + third * 10 + second);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        changeNum(591);
    }
}
