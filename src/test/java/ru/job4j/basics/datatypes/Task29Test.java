package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task29} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task29Test {

    /** Verifies the digit sum of {@code 325}. */
    @Test
    void when325Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(325);
        assertThat(out.toString())
                .isEqualTo("10" + System.lineSeparator());
    }

    /** Verifies the digit sum of {@code 100}. */
    @Test
    void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(100);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the digit sum of {@code 909}. */
    @Test
    void when909Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(909);
        assertThat(out.toString())
                .isEqualTo("18" + System.lineSeparator());
    }
}
