package ru.job4j.basics.datatypes;

import java.util.Locale;

/**
 * Calculates the sum of two amounts and converts the result to Euro.
 *
 * <p>Example output for {@code money = 5000.0}, {@code gift = 7000.0},
 * and {@code ratio = 0.016516}:
 * <pre>{@code
 * 198.19
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19 {

    /**
     * Calculates the sum of money and gift, then converts it to Euro.
     *
     * @param money the initial amount
     * @param gift the gift amount
     * @param ratio the conversion rate to Euro
     */
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf(Locale.US, "%.2f", euro);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        sumAndConvert(5000, 7000, 0.016516);
    }
}
