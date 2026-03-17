package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task32} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task32Test {

    /** Verifies the case when only the second digit is even. */
    @Test
    void when36Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(36);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the case when both digits are even. */
    @Test
    void when64Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(64);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the case when no digits are even. */
    @Test
    void when35Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(35);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the case when only the first digit is even. */
    @Test
    void when67Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(67);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the case with zero as an even digit. */
    @Test
    void when50Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.evenAmount(50);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }
}
