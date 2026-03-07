package ru.job4j.basics.datatypes;

/**
 * Separates a three-digit number into individual digits.
 *
 * <p>Example output for {@code number = 205}:
 * <pre>{@code
 * 2 0 5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21 {

    /**
     * Separates the given three-digit number into hundreds, tens, and units.
     *
     * @param number the three-digit positive integer
     */
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        separate(205);
    }
}
