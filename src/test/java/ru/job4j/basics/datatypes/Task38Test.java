package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task38} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task38Test {

    /** Verifies linear left shift for {@code 1234}. */
    @Test
    void when1234Then2340() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1234);
        assertThat(out.toString())
                .isEqualTo("2340" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 1200}. */
    @Test
    void when1200Then2000() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1200);
        assertThat(out.toString())
                .isEqualTo("2000" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 1000}. */
    @Test
    void when1000Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1000);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 1060}. */
    @Test
    void when1060Then600() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1060);
        assertThat(out.toString())
                .isEqualTo("600" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 1006}. */
    @Test
    void when1006Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1006);
        assertThat(out.toString())
                .isEqualTo("60" + System.lineSeparator());
    }
}
