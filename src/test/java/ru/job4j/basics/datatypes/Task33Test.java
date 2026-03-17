package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task33} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task33Test {

    /** Verifies the case when only the middle digit is even. */
    @Test
    void when363Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(363);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the case when two digits (zeros) are even. */
    @Test
    void when300Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(300);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the case when no digits are even. */
    @Test
    void when351Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(351);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the case when all digits are even. */
    @Test
    void when624Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.evenAmount(624);
        assertThat(out.toString())
                .isEqualTo("3" + System.lineSeparator());
    }
}
