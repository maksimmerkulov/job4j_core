package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts Fahrenheit temperature to Celsius.
 *
 * <p>Example output for {@code fahrenheit = 90}:
 * <pre>{@code
 * 32.2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task10 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = 5 * (fahrenheit - 32) / 9.0;
        System.out.printf(Locale.US, "%.1f", celsius);
    }
}
