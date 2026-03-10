package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task36} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task36Test {

    /** Verifies digit swap for {@code 3642}. */
    @Test
    void when3642Then2643() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3642);
        assertThat(out.toString())
                .isEqualTo("2643" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 1000}. */
    @Test
    void when1000Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1000);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 1050}. */
    @Test
    void when1050Then51() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1050);
        assertThat(out.toString())
                .isEqualTo("51" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 1001}. */
    @Test
    void when1001Then1001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1001);
        assertThat(out.toString())
                .isEqualTo("1001" + System.lineSeparator());
    }

    /** Verifies digit swap for {@code 3609}. */
    @Test
    void when3609Then9603() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3609);
        assertThat(out.toString())
                .isEqualTo("9603" + System.lineSeparator());
    }
}
