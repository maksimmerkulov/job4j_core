package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task20} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task20Test {

    /** Verifies the output for arguments {@code 1} and {@code 1}. */
    @Test
    void when1And1ThenPrintSum2AndProduct1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task20.print(1, 1);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "Variables: 1 1" + System.lineSeparator()
                        + "Sum: 2" + System.lineSeparator()
                        + "Product: 1" + System.lineSeparator()
        );
    }

    /** Verifies the output for arguments {@code 3} and {@code 5}. */
    @Test
    void when3And5ThenPrintSum8AndProduct15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task20.print(3, 5);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "Variables: 3 5" + System.lineSeparator()
                        + "Sum: 8" + System.lineSeparator()
                        + "Product: 15" + System.lineSeparator()
        );
    }

    /** Verifies the output for arguments {@code 2} and {@code 3}. */
    @Test
    void when2And3ThenPrintSum5AndProduct6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task20.print(2, 3);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "Variables: 2 3" + System.lineSeparator()
                        + "Sum: 5" + System.lineSeparator()
                        + "Product: 6" + System.lineSeparator()
        );
    }
}
