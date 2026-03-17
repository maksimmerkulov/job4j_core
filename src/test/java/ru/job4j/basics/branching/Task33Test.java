package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task33} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task33Test {

    /** Verifies that a positive number leads to an error. */
    @Test
    void when1ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(1);
        assertThat(out.toString())
                .isEqualTo("Error" + System.lineSeparator());
    }

    /** Verifies that zero leads to an error. */
    @Test
    void when0ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(0);
        assertThat(out.toString())
                .isEqualTo("Error" + System.lineSeparator());
    }

    /** Verifies the square of {@code -1}. */
    @Test
    void whenMinus1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(-1);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the square of {@code -4}. */
    @Test
    void whenMinus4Then16() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.numSquare(-4);
        assertThat(out.toString())
                .isEqualTo("16" + System.lineSeparator());
    }
}
