package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task15} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task15Test {

    /** Verifies character sequences on separate lines in console output. */
    @Test
    void whenMainThenPrintSequencesOnSeparateLines() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task15.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("+++%s!!!!%s??".formatted(
                System.lineSeparator(),
                System.lineSeparator()
        ));
    }
}
