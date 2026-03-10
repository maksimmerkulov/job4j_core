package ru.job4j.basics.datatypes;

/**
 * Calculates and prints the amount of even digits in a four-digit number.
 *
 * <p>Example output for {@code number = 4012}:
 * <pre>{@code
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task34 {

    /**
     * Calculates the number of even digits in the specified number.
     *
     * @param number the four-digit positive integer
     */
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000;
        num2 = (number / 100) % 10;
        num3 = (number / 10) % 10;
        num4 = number % 10;
        counter += 1 - (num1 % 2);
        counter += 1 - (num2 % 2);
        counter += 1 - (num3 % 2);
        counter += 1 - (num4 % 2);
        System.out.println(counter);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        evenAmount(4012);
    }
}
