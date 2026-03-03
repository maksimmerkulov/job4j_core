package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task12} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task12Test {

    /** Verifies the console output of the {@code main} method. */
    @Test
    void whenMainThenPrintPingPong() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task12.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "Ping" + System.lineSeparator()
                        + "Pong" + System.lineSeparator()
        );
    }
}
