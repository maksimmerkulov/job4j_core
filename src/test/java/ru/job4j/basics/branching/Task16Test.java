package ru.job4j.basics.branching;

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

    /** Verifies the case when the number is zero. */
    @Test
    void when0ThenZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(0);
        assertThat(out.toString())
                .isEqualTo("Zero" + System.lineSeparator());
    }

    /** Verifies the case when the number is a positive integer. */
    @Test
    void when4ThenNotZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(4);
        assertThat(out.toString())
                .isEqualTo("Not zero" + System.lineSeparator());
    }

    /** Verifies the case when the number is a negative integer. */
    @Test
    void whenMinus4ThenNotZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.zeroCheck(-4);
        assertThat(out.toString())
                .isEqualTo("Not zero" + System.lineSeparator());
    }
}
