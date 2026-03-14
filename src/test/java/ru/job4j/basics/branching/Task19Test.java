package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task19} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task19Test {

    /** Verifies addition when the first number is greater. */
    @Test
    void when10And9Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(10, 9);
        assertThat(out.toString())
                .isEqualTo("19" + System.lineSeparator());
    }

    /** Verifies multiplication when the second number is greater. */
    @Test
    void when9And10Then90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(9, 10);
        assertThat(out.toString())
                .isEqualTo("90" + System.lineSeparator());
    }

    /** Verifies addition with negative numbers. */
    @Test
    void whenMinus9AndMinus10ThenMinus19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(-9, -10);
        assertThat(out.toString())
                .isEqualTo("-19" + System.lineSeparator());
    }

    /** Verifies multiplication with negative numbers. */
    @Test
    void whenMinus10AndMinus9Then90() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(-10, -9);
        assertThat(out.toString())
                .isEqualTo("90" + System.lineSeparator());
    }

    /** Verifies the case when numbers are equal. */
    @Test
    void when5And5ThenEqual() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumOrMultiply(5, 5);
        assertThat(out.toString())
                .isEqualTo("Numbers are equal" + System.lineSeparator());
    }
}
