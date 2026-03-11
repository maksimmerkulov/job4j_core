package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task42} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task42Test {

    /** Verifies circular right shift for {@code 1234}. */
    @Test
    void when1234Then4123() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1234);
        assertThat(out.toString())
                .isEqualTo("4123" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 1200}. */
    @Test
    void when1200Then120() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1200);
        assertThat(out.toString())
                .isEqualTo("120" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 1000}. */
    @Test
    void when1000Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1000);
        assertThat(out.toString())
                .isEqualTo("100" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 1060}. */
    @Test
    void when1060Then106() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1060);
        assertThat(out.toString())
                .isEqualTo("106" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 1006}. */
    @Test
    void when1006Then6100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1006);
        assertThat(out.toString())
                .isEqualTo("6100" + System.lineSeparator());
    }
}
