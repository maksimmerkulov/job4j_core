package ru.job4j.basics.branching;

/**
 * Counts and prints the number of even digits in a three-digit positive integer.
 *
 * <p>Example output for {@code number = 320}:
 * <pre>{@code
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task41 {

    /**
     * Calculates and prints the amount of even digits.
     *
     * @param number the three-digit positive integer to process
     */
    public static void evenDigitsAmount(int number) {
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        int counter = 0;
        if (first % 2 == 0) {
            counter++;
        }
        if (second % 2 == 0) {
            counter++;
        }
        if (third % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        evenDigitsAmount(320);
    }
}
