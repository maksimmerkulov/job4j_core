package ru.job4j.basics.datatypes;

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

    /** Verifies digit swap for {@code 123} and {@code 456}. */
    @Test
    void when123And456Then126And453() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(123, 456);
        assertThat(out.toString()).isEqualTo(
                "126" + System.lineSeparator()
                        + "453" + System.lineSeparator()
        );
    }

    /** Verifies digit swap for {@code 100} and {@code 999}. */
    @Test
    void when100And999Then109And990() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(100, 999);
        assertThat(out.toString()).isEqualTo(
                "109" + System.lineSeparator()
                        + "990" + System.lineSeparator()
        );
    }

    /** Verifies digit swap for {@code 555} and {@code 777}. */
    @Test
    void when555And777Then557And775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(555, 777);
        assertThat(out.toString()).isEqualTo(
                "557" + System.lineSeparator()
                        + "775" + System.lineSeparator()
        );
    }
}
