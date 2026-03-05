package ru.job4j.basics.datatypes;

import java.util.Scanner;

/**
 * Demonstrates reading and printing a {@code short} value.
 *
 * <p>Example output for {@code value = 4}:
 * <pre>{@code
 * 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortType {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}
