package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task45} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task45Test {

    /** Verifies first digit swap for {@code 123} and {@code 456}. */
    @Test
    void when123And456Then423And156() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(123, 456);
        assertThat(out.toString()).isEqualTo(
                "423" + System.lineSeparator()
                        + "156" + System.lineSeparator()
        );
    }

    /** Verifies first digit swap for {@code 999} and {@code 555}. */
    @Test
    void when999And555Then599And955() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(999, 555);
        assertThat(out.toString()).isEqualTo(
                "599" + System.lineSeparator()
                        + "955" + System.lineSeparator()
        );
    }

    /** Verifies first digit swap for {@code 900} and {@code 501}. */
    @Test
    void when900And501Then500And901() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(900, 501);
        assertThat(out.toString()).isEqualTo(
                "500" + System.lineSeparator()
                        + "901" + System.lineSeparator()
        );
    }
}
