package ru.job4j.basics.branching;

/**
 * Checks if two strings form a "special pair".
 *
 * <p>Example output for {@code l = "sparkling"} and {@code r = "groups"}:
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PairsCharString {

    /**
     * Verifies string pair based on their first and last characters.
     *
     * @param l the first string
     * @param r the second string
     * @return {@code true} if strings are empty or characters match,
     * otherwise {@code false}
     */
    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        if (l.isEmpty() || r.isEmpty()) {
            return false;
        }
        return l.charAt(0) == r.charAt(r.length() - 1)
                && l.charAt(l.length() - 1) == r.charAt(0);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(check("sparkling", "groups"));
    }
}
