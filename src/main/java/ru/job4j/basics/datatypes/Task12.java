package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts inches to centimeters.
 *
 * <p>Example output for {@code inches = 1}:
 * <pre>{@code
 * 2.54
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task12 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = inches * 2.54;
        System.out.printf(Locale.US, "%.2f", centimeters);
    }
}
