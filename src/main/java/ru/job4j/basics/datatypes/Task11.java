package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts centimeters to inches.
 *
 * <p>Example output for {@code centimeters = 1}:
 * <pre>{@code
 * 0.39
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task11 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double inches = centimeters / 2.54;
        System.out.printf(Locale.US, "%.2f", inches);
    }
}
