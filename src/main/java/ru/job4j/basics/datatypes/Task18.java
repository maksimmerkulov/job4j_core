package ru.job4j.basics.datatypes;

/**
 * Calculates the total prize points from bottle caps.
 *
 * <p>Example output for {@code tens = 1}, {@code hundreds = 2},
 * and {@code thousands = 3}:
 * <pre>{@code
 * 3210
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18 {

    /**
     * Calculates the sum of points based on the number of caps of each type.
     *
     * @param tens number of 10-point caps
     * @param hundreds number of 100-point caps
     * @param thousands number of 1000-point caps
     * @return the total sum of points
     */
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum = tens * 10 + hundreds * 100 + thousands * 1000;
        return sum;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(capSum(1, 2, 3));
    }
}
