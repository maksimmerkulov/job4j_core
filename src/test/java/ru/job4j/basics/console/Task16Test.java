package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task16} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task16Test {

    /** Verifies a single line of repeated characters in console output. */
    @Test
    void whenMainThenPrintAllCharactersOnOneLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task16.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("+++!!!!??");
    }
}
