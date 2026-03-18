package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task44} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task44Test {

    /** Verifies rounding down for {@code 553}. */
    @Test
    void when553Then550() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(553);
        assertThat(out.toString())
                .isEqualTo("550" + System.lineSeparator());
    }

    /** Verifies rounding up for {@code 57}. */
    @Test
    void when57Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(57);
        assertThat(out.toString())
                .isEqualTo("60" + System.lineSeparator());
    }

    /** Verifies rounding down for a four-digit number {@code 5501}. */
    @Test
    void when5501Then5500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(5501);
        assertThat(out.toString())
                .isEqualTo("5500" + System.lineSeparator());
    }

    /** Verifies that a round number {@code 53530} remains the same. */
    @Test
    void when53530Then53530() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(53530);
        assertThat(out.toString())
                .isEqualTo("53530" + System.lineSeparator());
    }

    /** Verifies rounding {@code 4} down to {@code 0}. */
    @Test
    void when4Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(4);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies rounding {@code 9} up to {@code 10}. */
    @Test
    void when9Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(9);
        assertThat(out.toString())
                .isEqualTo("10" + System.lineSeparator());
    }

    /** Verifies that the middle value {@code 5} rounds up to {@code 10}. */
    @Test
    void when5Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(5);
        assertThat(out.toString())
                .isEqualTo("10" + System.lineSeparator());
    }
}
