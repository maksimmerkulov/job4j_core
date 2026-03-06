package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates the perimeter and area of a right triangle.
 *
 * <p>Example output for {@code cathetA = 3.0}, {@code cathetB = 4.0},
 * and {@code hypotenuse = 5.0}:
 * <pre>{@code
 * 12.0
 * 6.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task14 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double cathetA = input.nextDouble();
        double cathetB = input.nextDouble();
        double hypotenuse = input.nextDouble();
        double perimeter = cathetA + cathetB + hypotenuse;
        double area = (cathetA * cathetB) / 2.0;
        System.out.printf(Locale.US, "%.1f%n%.1f", perimeter, area);
    }
}
