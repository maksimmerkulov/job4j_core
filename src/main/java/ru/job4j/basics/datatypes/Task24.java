package ru.job4j.basics.datatypes;

/**
 * Prints a two-digit number in its expanded form: tens and units.
 *
 * <p>Example output for {@code number = 34}:
 * <pre>{@code
 * 30+4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task24 {

    /**
     * Separates the given two-digit number into its expanded components.
     *
     * @param number the two-digit positive integer
     */
    public static void separate(int number) {
        int num1, num2;
        num1 = (number / 10) * 10;
        num2 = number % 10;
        System.out.println(num1 + "+" + num2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        separate(34);
    }
}
