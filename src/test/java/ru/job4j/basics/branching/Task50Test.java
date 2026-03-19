package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task50} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task50Test {

    /** Verifies that the larger last digit {@code 6} is printed. */
    @Test
    void when373And26Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(373, 26);
        assertThat(out.toString())
                .isEqualTo("6" + System.lineSeparator());
    }

    /** Verifies that the larger last digit {@code 5} is printed. */
    @Test
    void when5And21Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(5, 21);
        assertThat(out.toString())
                .isEqualTo("5" + System.lineSeparator());
    }

    /** Verifies that {@code Same} is printed when last digits are equal. */
    @Test
    void when20And200ThenSame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.maxLastDigit(20, 200);
        assertThat(out.toString())
                .isEqualTo("Same" + System.lineSeparator());
    }
}
