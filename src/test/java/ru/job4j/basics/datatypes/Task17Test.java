package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task17} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task17Test {

    /** Verifies calculations for inputs {@code 5} and {@code 4}. */
    @Test
    void whenInput5And4ThenPrint10Point0And18Point0() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(5, 4);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("10.0" + System.lineSeparator() + "18.0");
    }

    /** Verifies calculations for inputs {@code 3} and {@code 3}. */
    @Test
    void whenInput3And3ThenPrint4Point5And12Point0() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(3, 3);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("4.5" + System.lineSeparator() + "12.0");
    }

    /** Verifies calculations for inputs {@code 1} and {@code 7}. */
    @Test
    void whenInput1And7ThenPrint3Point5And16Point0() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(1, 7);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("3.5" + System.lineSeparator() + "16.0");
    }
}
