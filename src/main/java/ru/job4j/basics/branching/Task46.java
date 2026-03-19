package ru.job4j.basics.branching;

/**
 * Modifies two integers based on their values.
 *
 * <p>Example output for {@code num1 = 17} and {@code num2 = 25}:
 * <pre>{@code
 * 18
 * 24
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task46 {

    /**
     * Changes and prints two numbers line by line.
     *
     * @param num1 the first integer to process
     * @param num2 the second integer to process
     */
    public static void changeNums(int num1, int num2) {
        if (num1 == num2) {
            num1++;
            num2++;
        } else if (num1 > num2) {
            num1--;
            num2++;
        } else {
            num1++;
            num2--;
        }
        System.out.println(num1);
        System.out.println(num2);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        changeNums(17, 25);
    }
}
