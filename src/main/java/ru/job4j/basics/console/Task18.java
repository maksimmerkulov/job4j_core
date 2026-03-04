package ru.job4j.basics.console;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates geometric properties: square perimeter, circumference,
 * and circle area.
 *
 * <p>Example output for {@code a = 33.3} and {@code r = 33.3}:
 * <pre>{@code
 * 133.2
 * 209.2
 * 3483.7
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double perimeter = 4 * a;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        System.out.printf(Locale.US, "%.1f%n", perimeter);
        System.out.printf(Locale.US, "%.1f%n", circumference);
        System.out.printf(Locale.US, "%.1f%n", area);
    }
}
