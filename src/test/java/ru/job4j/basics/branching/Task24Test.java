package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task24} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task24Test {

    /** Verifies a fraction with two positive numbers. */
    @Test
    void when1And5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(1, 5);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a fraction with two negative numbers. */
    @Test
    void whenMinus1AndMinus5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(-1, -5);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a fraction with a negative numerator. */
    @Test
    void whenMinus1And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(-1, 5);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a fraction with a negative denominator. */
    @Test
    void when1AndMinus5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(1, -5);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
