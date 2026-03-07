package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task21} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task21Test {

    /** Verifies digit separation for input {@code 205}. */
    @Test
    void whenInput205ThenPrint2And0And5() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(205);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("2 0 5" + System.lineSeparator());
    }

    /** Verifies digit separation for input {@code 361}. */
    @Test
    void whenInput361ThenPrint3And6And1() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(361);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("3 6 1" + System.lineSeparator());
    }

    /** Verifies digit separation for input {@code 116}. */
    @Test
    void whenInput116ThenPrint1And1And6() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(116);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("1 1 6" + System.lineSeparator());
    }
}
