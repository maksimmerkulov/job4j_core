package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task28} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task28Test {

    /** Verifies the digit sum of {@code 32}. */
    @Test
    void when32Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(32);
        assertThat(out.toString())
                .isEqualTo("5" + System.lineSeparator());
    }

    /** Verifies the digit sum of {@code 10}. */
    @Test
    void when10Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(10);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies the digit sum of {@code 66}. */
    @Test
    void when66Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(66);
        assertThat(out.toString())
                .isEqualTo("12" + System.lineSeparator());
    }
}
