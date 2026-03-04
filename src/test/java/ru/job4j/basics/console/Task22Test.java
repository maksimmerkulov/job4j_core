package ru.job4j.basics.console;

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

    /** Verifies the {@code nameInsert} method for the name {@code Petr}. */
    @Test
    void whenPetrThenPrintHelloPetr() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Petr");
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("Hello, Petr!" + System.lineSeparator());
    }

    /** Verifies the {@code nameInsert} method for the name {@code Ivan}. */
    @Test
    void whenIvanThenPrintHelloIvan() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Ivan");
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("Hello, Ivan!" + System.lineSeparator());
    }

    /** Verifies the {@code nameInsert} method for the name {@code Elena}. */
    @Test
    void whenElenaThenPrintHelloElena() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Elena");
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("Hello, Elena!" + System.lineSeparator());
    }
}
