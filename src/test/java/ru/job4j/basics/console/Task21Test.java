package ru.job4j.basics.console;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task21} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task21Test {

    /** Verifies the frame output of the {@code main} method. */
    @Test
    void whenMainThenPrintInformationInFrame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        Task21.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "*********************" + System.lineSeparator()
                        + "* Full Name         *" + System.lineSeparator()
                        + "* +7(938) 123-45-67 *" + System.lineSeparator()
                        + "*********************"
        );
    }
}
