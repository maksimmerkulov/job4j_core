package ru.job4j.basics.console;

import java.util.Locale;
import java.util.Scanner;

/**
 * Performs basic arithmetic operations on two numbers from the console.
 *
 * <p>Example output for {@code a = 1.0} and {@code b = 0.1}:
 * <pre>{@code
 * 1.1
 * 0.9
 * 0.1
 * 10.0
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
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
