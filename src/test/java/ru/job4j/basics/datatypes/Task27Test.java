package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task27} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task27Test {

    /** Verifies transformation of {@code 327}. */
    @Test
    void when327Then703() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(327);
        assertThat(out.toString())
                .isEqualTo("703" + System.lineSeparator());
    }

    /** Verifies transformation of {@code 560}. */
    @Test
    void when560Then45() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(560);
        assertThat(out.toString())
                .isEqualTo("45" + System.lineSeparator());
    }

    /** Verifies transformation of {@code 100}. */
    @Test
    void when100ThenMinus19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(100);
        assertThat(out.toString())
                .isEqualTo("-19" + System.lineSeparator());
    }
}
