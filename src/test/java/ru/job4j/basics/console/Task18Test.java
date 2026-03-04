package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task18} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task18Test {

    /** Verifies geometric calculations with console input. */
    @Test
    void whenInputSideAndRadiusThenPrintGeometricResults() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream(
                ("33.3" + System.lineSeparator()
                        + "33.3" + System.lineSeparator()).getBytes()
        ));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "133.2" + System.lineSeparator()
                        + "209.2" + System.lineSeparator()
                        + "3483.7" + System.lineSeparator()
        );
    }
}
