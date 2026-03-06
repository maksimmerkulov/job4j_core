package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task9} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task9Test {

    /** Verifies calculations for inputs {@code 1} and {@code 1}. */
    @Test
    void whenInput1And1ThenPrintResults() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("1 1".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "2" + System.lineSeparator()
                        + "0" + System.lineSeparator()
                        + "1" + System.lineSeparator()
                        + "1" + System.lineSeparator()
        );
    }

    /** Verifies calculations for inputs {@code 2} and {@code 2}. */
    @Test
    void whenInput2And2ThenPrintResults() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("2 2".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task9.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "4" + System.lineSeparator()
                        + "0" + System.lineSeparator()
                        + "4" + System.lineSeparator()
                        + "1" + System.lineSeparator()
        );
    }
}
