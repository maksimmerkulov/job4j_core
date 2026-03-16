package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task28} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task28Test {

    /** Verifies the case when the number of desks is exactly enough. */
    @Test
    void when20And10ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.isEnough(20, 10);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case when there are more desks than needed. */
    @Test
    void when20And12ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.isEnough(20, 12);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case when there are not enough desks. */
    @Test
    void when20And9ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.isEnough(20, 9);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when there are no desks. */
    @Test
    void when20And0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.isEnough(20, 0);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when there are no pupils but desks are present. */
    @Test
    void when0And10ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.isEnough(0, 10);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }
}
