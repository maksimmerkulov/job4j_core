package ru.job4j.basics.branching;

/**
 * Checks if a number is a valid school grade.
 *
 * <p>Example output for {@code grade = -2}:
 * <pre>{@code
 * No
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task35 {

    /**
     * Prints {@code "Yes"} if the grade is between {@code 1} and {@code 5},
     * otherwise prints {@code "No"}.
     *
     * @param grade the integer to check
     */
    public static void gradeCheck(int grade) {
        if (grade >= 1 && grade <= 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        gradeCheck(-2);
    }
}
