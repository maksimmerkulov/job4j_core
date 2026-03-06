package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task12} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task12Test {

    /** Verifies inch to centimeter conversion for input {@code 1}. */
    @Test
    void whenInput1ThenPrint2Point54() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("2.54");
    }

    /** Verifies inch to centimeter conversion for input {@code 25}. */
    @Test
    void whenInput25ThenPrint63Point50() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("25".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("63.50");
    }

    /** Verifies inch to centimeter conversion for input {@code 96}. */
    @Test
    void whenInput96ThenPrint243Point84() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("96".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("243.84");
    }
}
