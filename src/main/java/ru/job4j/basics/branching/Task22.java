package ru.job4j.basics.branching;

/**
 * Determines if a quadratic equation has real roots.
 *
 * <p>Example output for {@code a = 1}, {@code b = -1}, and {@code c = -6}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22 {

    /**
     * Prints {@code "Yes"} if the discriminant is non-negative,
     * otherwise prints {@code "No"}.
     *
     * @param a the first coefficient
     * @param b the second coefficient
     * @param c the constant term
     */
    public static void haveRoots(int a, int b, int c) {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println(discriminant >= 0 ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        haveRoots(1, -1, -6);
    }
}
