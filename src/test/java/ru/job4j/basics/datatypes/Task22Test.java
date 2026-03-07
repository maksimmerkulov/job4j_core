package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task22} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task22Test {

    /** Verifies reversed digit separation for input {@code 20}. */
    @Test
    void whenInput20ThenPrint0And2() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(20);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("0 2" + System.lineSeparator());
    }

    /** Verifies reversed digit separation for input {@code 37}. */
    @Test
    void whenInput37ThenPrint7And3() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(37);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("7 3" + System.lineSeparator());
    }

    /** Verifies reversed digit separation for input {@code 86}. */
    @Test
    void whenInput86ThenPrint6And8() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(86);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("6 8" + System.lineSeparator());
    }
}
