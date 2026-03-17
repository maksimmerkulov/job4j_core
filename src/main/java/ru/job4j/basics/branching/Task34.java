package ru.job4j.basics.branching;

/**
 * Checks the correspondence between pupils and chairs.
 *
 * <p>Example output for {@code pupils = 12} and {@code chairs = 10}:
 * <pre>{@code
 * Missing chairs: 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task34 {

    /**
     * Prints the result of the chair check.
     *
     * @param pupils the number of pupils
     * @param chairs the number of chairs
     */
    public static void chairsCheck(int pupils, int chairs) {
        if (chairs > pupils) {
            System.out.println("Extra chairs: " + (chairs - pupils));
        } else if (pupils > chairs) {
            System.out.println("Missing chairs: " + (pupils - chairs));
        } else {
            System.out.println("Matches");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        chairsCheck(12, 10);
    }
}
