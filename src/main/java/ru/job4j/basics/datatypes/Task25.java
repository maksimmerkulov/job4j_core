package ru.job4j.basics.datatypes;

/**
 * Prints a three-digit number in expanded form: hundreds, tens, and units.
 *
 * <p>Example output for {@code number = 345}:
 * <pre>{@code
 * 300+40+5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task25 {

    /**
     * Separates the given three-digit number into its expanded components.
     *
     * @param number the three-digit positive integer
     */
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = (number / 100) * 100;
        num2 = ((number % 100) / 10) * 10;
        num3 = number % 10;
        System.out.println(num1 + "+" + num2 + "+" + num3);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        separate(345);
    }
}
