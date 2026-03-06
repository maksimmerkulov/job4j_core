package ru.job4j.basics.datatypes;

import java.util.Scanner;

/**
 * Calculates and prints the sum, difference, product,
 * and quotient of two integers.
 *
 * <p>Example output for {@code a = 1} and {@code b = 1}:
 * <pre>{@code
 * 2
 * 0
 * 1
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task9 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
