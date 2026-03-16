package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task25} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task25Test {

    /** Verifies that a positive number is detected. */
    @Test
    void when1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(1);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that {@code 0} is not considered positive. */
    @Test
    void when0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(0);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies that a negative number is not considered positive. */
    @Test
    void whenMinus1ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(-1);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
