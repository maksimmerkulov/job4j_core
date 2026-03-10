package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task35} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task35Test {

    /** Verifies digit swap for {@code 364}. */
    @Test
    void when364Then463() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(364);
        assertThat(out.toString())
                .isEqualTo("463" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 121}. */
    @Test
    void when121Then121() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(121);
        assertThat(out.toString())
                .isEqualTo("121" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 100}. */
    @Test
    void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(100);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 650}. */
    @Test
    void when650Then56() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(650);
        assertThat(out.toString())
                .isEqualTo("56" + System.lineSeparator());
    }
}
