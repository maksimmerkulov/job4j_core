package ru.job4j.basics.branching;

/**
 * Determines the arithmetic action performed on two numbers.
 *
 * <p>Example output for {@code left = 5}, {@code right = 10},
 * and {@code rsl = 15}:
 * <pre>{@code
 * added
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ArithmeticActions {

    /**
     * Selects the name of the arithmetic action.
     *
     * @param left the first operand
     * @param right the second operand
     * @param rsl the expected result of the operation
     * @return the name of the action, or {@code "none"} if no action matches
     */
    public static String selectAction(int left, int right, int rsl) {
        if (left + right == rsl) {
            return "added";
        } else if (left - right == rsl) {
            return "subtracted";
        } else if (left * right == rsl) {
            return "multiplied";
        } else if (right != 0 && left / right == rsl) {
            return "divided";
        } else {
            return "none";
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(selectAction(5, 10, 15));
    }
}
