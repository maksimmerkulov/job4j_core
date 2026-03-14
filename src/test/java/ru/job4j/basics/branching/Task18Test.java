package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task18} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task18Test {

    /** Verifies that a two-digit number remains unchanged. */
    @Test
    void when10Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(10);
        assertThat(out.toString())
                .isEqualTo("10" + System.lineSeparator());
    }

    /** Verifies that {@code 0} remains unchanged. */
    @Test
    void when0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(0);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies that a negative number remains unchanged. */
    @Test
    void whenMinus10ThenMinus10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(-10);
        assertThat(out.toString())
                .isEqualTo("-10" + System.lineSeparator());
    }

    /** Verifies that {@code 99} remains unchanged (boundary case). */
    @Test
    void when99Then99() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(99);
        assertThat(out.toString())
                .isEqualTo("99" + System.lineSeparator());
    }

    /** Verifies that {@code 100} is decreased by one (boundary case). */
    @Test
    void when100Then99() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(100);
        assertThat(out.toString())
                .isEqualTo("99" + System.lineSeparator());
    }

    /** Verifies that a four-digit number is decreased by one. */
    @Test
    void when9999Then9998() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.numDecrease(9999);
        assertThat(out.toString())
                .isEqualTo("9998" + System.lineSeparator());
    }
}
