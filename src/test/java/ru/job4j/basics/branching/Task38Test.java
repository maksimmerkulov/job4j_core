package ru.job4j.basics.branching;

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

    /** Verifies the case when the second digit is larger. */
    @Test
    void when37Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(37);
        assertThat(out.toString())
                .isEqualTo("7" + System.lineSeparator());
    }

    /** Verifies the case when the first digit is larger. */
    @Test
    void when40Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(40);
        assertThat(out.toString())
                .isEqualTo("4" + System.lineSeparator());
    }

    /** Verifies the case when digits are equal. */
    @Test
    void when55ThenEqual() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.maxDigit(55);
        assertThat(out.toString())
                .isEqualTo("Equal" + System.lineSeparator());
    }
}
