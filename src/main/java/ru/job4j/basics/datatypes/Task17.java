package ru.job4j.basics.datatypes;

import java.util.Locale;

/**
 * Calculates triangle area and rectangle perimeter.
 *
 * <p>Example output for {@code base = 5} and {@code height = 4}:
 * <pre>{@code
 * 10.0
 * 18.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17 {

    /**
     * Calculates area and perimeter and prints results.
     *
     * @param base the base value
     * @param height the height value
     */
    public static void calculate(int base, int height) {
        double area = 0.5 * base * height;
        double perimeter = 2 * (base + height);
        System.out.printf(Locale.US, "%.1f%n%.1f", area, perimeter);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        calculate(5, 4);
    }
}
