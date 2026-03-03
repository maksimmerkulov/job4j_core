package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task14} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task14Test {

    /** Verifies the console output of the {@code main} method. */
    @Test
    void whenMainThenPrintStringWithHyphens() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task14.main(null);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("H-e-l-l-o-,-f-r-i-e-n-d!");
    }
}
