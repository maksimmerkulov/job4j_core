package ru.job4j.basics.datatypes;

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

    /** Verifies digit swap for {@code 123} and {@code 4567}. */
    @Test
    void when123And4567Then127And4563() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(123, 4567);
        assertThat(out.toString()).isEqualTo(
                "127" + System.lineSeparator()
                        + "4563" + System.lineSeparator()
        );
    }

    /** Verifies digit swap for {@code 555} and {@code 7777}. */
    @Test
    void when555And7777Then557And7775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(555, 7777);
        assertThat(out.toString()).isEqualTo(
                "557" + System.lineSeparator()
                        + "7775" + System.lineSeparator()
        );
    }

    /** Verifies digit swap for {@code 12345} and {@code 67}. */
    @Test
    void when12345And67Then12347And65() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(12345, 67);
        assertThat(out.toString()).isEqualTo(
                "12347" + System.lineSeparator()
                        + "65" + System.lineSeparator()
        );
    }
}
