package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MathAbs} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MathAbsTest {

    /** Verifies that the absolute value result is printed correctly. */
    @Test
    void whenMainThenPrintAbsoluteValueResult() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathAbs.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("5.0" + System.lineSeparator());
    }
}
