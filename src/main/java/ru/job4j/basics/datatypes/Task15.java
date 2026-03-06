package ru.job4j.basics.datatypes;

/**
 * Generates a sequence of three numbers with a step of {@code 2}.
 *
 * <p>Example output for {@code number = 6}:
 * <pre>{@code
 * 8, 10, 12
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15 {

    /**
     * Increases the given number three times with a step of {@code 2}.
     *
     * @param number the starting number
     * @return a string of three numbers separated by commas
     */
    public static String increaseBy2(int number) {
        int a, b, c;
        a = number + 2;
        b = a + 2;
        c = b + 2;
        return a + ", " + b + ", " + c;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(increaseBy2(6));
    }
}
