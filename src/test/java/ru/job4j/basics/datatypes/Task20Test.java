package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task20} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task20Test {

    /** Verifies digit separation for input {@code 20}. */
    @Test
    void whenInput20ThenPrint2And0() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(20);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("2 0" + System.lineSeparator());
    }

    /** Verifies digit separation for input {@code 36}. */
    @Test
    void whenInput36ThenPrint3And6() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(36);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("3 6" + System.lineSeparator());
    }

    /** Verifies digit separation for input {@code 11}. */
    @Test
    void whenInput11ThenPrint1And1() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(11);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("1 1" + System.lineSeparator());
    }
}
