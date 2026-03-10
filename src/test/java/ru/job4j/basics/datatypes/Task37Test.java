package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task37} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task37Test {

    /** Verifies linear left shift for {@code 123}. */
    @Test
    void when123Then230() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(123);
        assertThat(out.toString())
                .isEqualTo("230" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 120}. */
    @Test
    void when120Then200() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(120);
        assertThat(out.toString())
                .isEqualTo("200" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 100}. */
    @Test
    void when100Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(100);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies linear left shift for {@code 106}. */
    @Test
    void when106Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(106);
        assertThat(out.toString())
                .isEqualTo("60" + System.lineSeparator());
    }
}
