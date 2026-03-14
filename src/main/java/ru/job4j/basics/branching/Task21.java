package ru.job4j.basics.branching;

/**
 * Compares the signs of two numbers and prints the result.
 *
 * <p>Example output for {@code number1 = 1} and {@code number2 = 2}:
 * <pre>{@code
 * Same
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21 {

    /**
     * Prints {@code "Same"} if signs are equal, {@code "Different"} if not,
     * or {@code "Incorrect"} if any number is zero.
     *
     * @param number1 the first integer
     * @param number2 the second integer
     */
    public static void signCheck(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            System.out.println("Incorrect");
        } else if ((number1 > 0 && number2 > 0)
                || (number1 < 0 && number2 < 0)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        signCheck(1, 2);
    }
}
