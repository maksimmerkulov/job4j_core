package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task16} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task16Test {

    /** Verifies the sequence for input {@code 6}. */
    @Test
    void whenInput6ThenPrint5And4And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(6);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "5" + System.lineSeparator()
                        + "4" + System.lineSeparator()
                        + "3" + System.lineSeparator()
        );
    }

    /** Verifies the sequence for input {@code 0}. */
    @Test
    void whenInput0ThenPrintMinus1AndMinus2AndMinus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(0);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "-1" + System.lineSeparator()
                        + "-2" + System.lineSeparator()
                        + "-3" + System.lineSeparator()
        );
    }
}
