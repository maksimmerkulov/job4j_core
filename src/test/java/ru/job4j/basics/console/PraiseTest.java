package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Praise} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class PraiseTest {

    /** Verifies the console output of the {@code main} method. */
    @Test
    void whenMainThenPrintPraiseMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Praise.main(null);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("I am doing great today!" + System.lineSeparator());
    }
}
