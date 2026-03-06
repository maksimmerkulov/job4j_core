package ru.job4j.basics.datatypes;

/**
 * Decreases a given number three times and prints each step.
 *
 * <p>Example output for {@code number = 6}:
 * <pre>{@code
 * 5
 * 4
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16 {

    /**
     * Decreases the given number three times and prints the results.
     *
     * @param number the starting number
     */
    public static void decreaseBy2(int number) {
        int a, b, c;
        a = number - 1;
        b = a - 1;
        c = b - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        decreaseBy2(6);
    }
}
