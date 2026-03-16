package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task30} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task30Test {

    /** Verifies that a negative number becomes positive. */
    @Test
    void whenMinus6Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(-6);
        assertThat(out.toString())
                .isEqualTo("6" + System.lineSeparator());
    }

    /** Verifies that a positive number becomes {@code 0}. */
    @Test
    void when6Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(6);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies that {@code 0} remains unchanged. */
    @Test
    void when0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(0);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }
}
