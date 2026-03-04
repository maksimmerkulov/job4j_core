package ru.job4j.basics.console;

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

    /** Verifies the square and cube output of the {@code main} method. */
    @Test
    void whenMainThenPrintNumberSquareAndCube() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task17.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "6" + System.lineSeparator()
                        + "36" + System.lineSeparator()
                        + "216" + System.lineSeparator()
        );
    }
}
