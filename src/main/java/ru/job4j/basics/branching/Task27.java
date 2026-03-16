package ru.job4j.basics.branching;

/**
 * Checks if there are enough chairs for all pupils.
 *
 * <p>Example output for {@code pupils = 18} and {@code chairs = 20}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task27 {

    /**
     * Prints {@code "Yes"} if chairs are equal to or greater than pupils,
     * otherwise prints {@code "No"}.
     *
     * @param pupils the number of pupils
     * @param chairs the number of chairs
     */
    public static void isEnough(int pupils, int chairs) {
        System.out.println(chairs >= pupils ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        isEnough(18, 20);
    }
}
