package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task20} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task20Test {

    /** Verifies a number where the first digit is odd. */
    @Test
    void when122ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.numCheck(122);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a number where the second digit is odd. */
    @Test
    void when212ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.numCheck(212);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a number where the third digit is odd. */
    @Test
    void when221ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.numCheck(221);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a standard even-beautiful number. */
    @Test
    void when246ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.numCheck(246);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies an even-beautiful number containing zero. */
    @Test
    void when808ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.numCheck(808);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }
}
