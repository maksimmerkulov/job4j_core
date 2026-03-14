package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task17} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task17Test {

    /** Verifies the case when the number is zero. */
    @Test
    void when0ThenZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(0);
        assertThat(out.toString())
                .isEqualTo("Zero" + System.lineSeparator());
    }

    /** Verifies the case when the number is negative. */
    @Test
    void whenMinus1ThenNegative() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(-1);
        assertThat(out.toString())
                .isEqualTo("Negative" + System.lineSeparator());
    }

    /** Verifies the case when the number is positive. */
    @Test
    void when1ThenPositive() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.signCheck(1);
        assertThat(out.toString())
                .isEqualTo("Positive" + System.lineSeparator());
    }
}
