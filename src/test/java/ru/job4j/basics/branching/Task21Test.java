package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task21} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task21Test {

    /** Verifies that positive numbers have the same sign. */
    @Test
    void when1And2ThenSame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(1, 2);
        assertThat(out.toString())
                .isEqualTo("Same" + System.lineSeparator());
    }

    /** Verifies that negative numbers have the same sign. */
    @Test
    void whenMinus1AndMinus2ThenSame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(-1, -2);
        assertThat(out.toString())
                .isEqualTo("Same" + System.lineSeparator());
    }

    /** Verifies that numbers with different signs are detected. */
    @Test
    void whenMinus1And2ThenDifferent() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(-1, 2);
        assertThat(out.toString())
                .isEqualTo("Different" + System.lineSeparator());
    }

    /** Verifies that zero input leads to incorrect status. */
    @Test
    void when0AndMinus2ThenIncorrect() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(0, -2);
        assertThat(out.toString())
                .isEqualTo("Incorrect" + System.lineSeparator());
    }

    /** Verifies that both zeros lead to incorrect status. */
    @Test
    void when0And0ThenIncorrect() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.signCheck(0, 0);
        assertThat(out.toString())
                .isEqualTo("Incorrect" + System.lineSeparator());
    }
}
