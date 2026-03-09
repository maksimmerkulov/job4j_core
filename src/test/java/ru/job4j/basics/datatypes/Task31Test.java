package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task31} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task31Test {

    /** Verifies the result for {@code 352}. */
    @Test
    void when352Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(352);
        assertThat(out.toString()).isEqualTo("5" + System.lineSeparator());
    }

    /** Verifies the result for {@code 309}. */
    @Test
    void when309Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(309);
        assertThat(out.toString()).isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the result for {@code 190}. */
    @Test
    void when190Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(190);
        assertThat(out.toString()).isEqualTo("9" + System.lineSeparator());
    }

    /** Verifies the result for {@code 363}. */
    @Test
    void when363Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(363);
        assertThat(out.toString()).isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the result for {@code 101}. */
    @Test
    void when101Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(101);
        assertThat(out.toString()).isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the result for {@code 226}. */
    @Test
    void when226Then8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(226);
        assertThat(out.toString()).isEqualTo("8" + System.lineSeparator());
    }
}
