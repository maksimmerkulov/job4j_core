package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task43} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task43Test {

    /** Verifies that {@code 200} contains a zero. */
    @Test
    void when200ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.containsZero(200);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that {@code 201} contains a zero. */
    @Test
    void when201ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.containsZero(201);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that {@code 221} does not contain any zeros. */
    @Test
    void when221ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.containsZero(221);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies that {@code 999} does not contain any zeros. */
    @Test
    void when999ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.containsZero(999);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
