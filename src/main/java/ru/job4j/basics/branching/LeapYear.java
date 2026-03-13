package ru.job4j.basics.branching;

/**
 * Determines if a given year is a leap year.
 *
 * <p>Example output for {@code year = 2000}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LeapYear {

    /**
     * Checks if the year is leap.
     *
     * @param year the year to check
     * @return {@code true} if the year is leap, {@code false} otherwise
     */
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(checkYear(2000));
    }
}
