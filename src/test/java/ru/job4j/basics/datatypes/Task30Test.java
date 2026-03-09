package ru.job4j.basics.datatypes;

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

    /** Verifies the difference for {@code 35}. */
    @Test
    void when35Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(35);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the difference for {@code 53}. */
    @Test
    void when53Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(53);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the difference for {@code 10}. */
    @Test
    void when10Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(10);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the difference for {@code 11}. */
    @Test
    void when11Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(11);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }
}
