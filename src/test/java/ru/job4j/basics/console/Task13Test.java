package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task13} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task13Test {

    /** Verifies arithmetic operations with console input. */
    @Test
    void whenInput1And0Point1ThenPrintCalculations() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream(
                ("1.0" + System.lineSeparator()
                        + "0.1" + System.lineSeparator()).getBytes()
        ));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task13.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "1.1" + System.lineSeparator()
                        + "0.9" + System.lineSeparator()
                        + "0.1" + System.lineSeparator()
                        + "10.0" + System.lineSeparator()
        );
    }
}
