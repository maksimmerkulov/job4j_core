package ru.job4j.basics.branching;

/**
 * Checks a number for divisibility by {@code 3} and {@code 5}.
 *
 * <p>Example output for {@code number = 15}:
 * <pre>{@code
 * Hello, World!!!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HelloWorld {

    /**
     * Returns a string based on the divisibility of the number.
     *
     * @param number the integer to check
     * @return a message string depending on divisibility
     */
    public static String checkNumber(int number) {
        boolean div3 = number % 3 == 0;
        boolean div5 = number % 5 == 0;
        if (div3 && div5) {
            return "Hello, World!!!";
        } else if (div3) {
            return "Hello";
        } else if (div5) {
            return "World";
        } else {
            return "Operation not support";
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(checkNumber(15));
    }
}
