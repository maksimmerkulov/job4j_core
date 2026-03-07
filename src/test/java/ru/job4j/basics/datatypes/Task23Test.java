package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task23} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task23Test {

    /** Verifies reversed digit separation for input {@code 205}. */
    @Test
    void whenInput205ThenPrint5And0And2() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(205);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("5 0 2" + System.lineSeparator());
    }

    /** Verifies reversed digit separation for input {@code 778}. */
    @Test
    void whenInput778ThenPrint8And7And7() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(778);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("8 7 7" + System.lineSeparator());
    }

    /** Verifies reversed digit separation for input {@code 165}. */
    @Test
    void whenInput165ThenPrint5And6And1() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(165);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("5 6 1" + System.lineSeparator());
    }
}
