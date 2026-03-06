package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts a currency amount using an exchange rate.
 *
 * <p>Example output for {@code dollars = 15} and {@code transferRate = 60.85}:
 * <pre>{@code
 * 912.75
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task13 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int dollars = input.nextInt();
        double transferRate = input.nextDouble();
        double rslCurrency = dollars * transferRate;
        System.out.printf(Locale.US, "%.2f", rslCurrency);
    }
}
