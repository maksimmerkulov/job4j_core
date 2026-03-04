package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task19} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task19Test {

    /** Verifies the output of a variable and its square. */
    @Test
    void whenMainThenPrintValueAndSquare() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task19.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "Value x is 9" + System.lineSeparator()
                        + "Value x^2 is 81" + System.lineSeparator()
        );
    }
}
