package ru.job4j.basics.branching;

/**
 * Checks if there are enough desks for all pupils.
 *
 * <p>Example output for {@code pupils = 20} and {@code desks = 10}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task28 {

    /**
     * Prints {@code "Yes"} if desks can accommodate all pupils,
     * otherwise prints {@code "No"}.
     *
     * <p>Note: Each desk accommodates exactly {@code 2} pupils.
     *
     * @param pupils the number of pupils
     * @param desks the number of desks
     */
    public static void isEnough(int pupils, int desks) {
        System.out.println(desks * 2 >= pupils ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isEnough(20, 10);
    }
}
