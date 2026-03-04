package ru.job4j.basics.console;

/**
 * Prints user information within a frame made of {@code *} characters.
 *
 * <p>Example output:
 * <pre>{@code
 * ************************
 * * Full Name            *
 * * +7(938) 123-45-67    *
 * ************************}</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21 {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String fullName = "Full Name";
        String phoneNumber = "+7(938) 123-45-67";
        int width = Math.max(fullName.length(), phoneNumber.length());
        System.out.println("*".repeat(width + 4));
        System.out.println(
                "* "
                        + fullName
                        + " ".repeat(width - fullName.length())
                        + " *"
        );
        System.out.println(
                "* "
                        + phoneNumber
                        + " ".repeat(width - phoneNumber.length())
                        + " *"
        );
        System.out.print("*".repeat(width + 4));
    }
}
