package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task40} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task40Test {

    /** Verifies circular left shift for {@code 1234}. */
    @Test
    void when1234Then2341() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1234);
        assertThat(out.toString())
                .isEqualTo("2341" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 1200}. */
    @Test
    void when1200Then2001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1200);
        assertThat(out.toString())
                .isEqualTo("2001" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 1000}. */
    @Test
    void when1000Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1000);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 1060}. */
    @Test
    void when1060Then601() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1060);
        assertThat(out.toString())
                .isEqualTo("601" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 1006}. */
    @Test
    void when1006Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1006);
        assertThat(out.toString())
                .isEqualTo("61" + System.lineSeparator());
    }
}
