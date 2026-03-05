package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MathPow} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MathPowTest {

    /** Verifies that the exponentiation result is printed correctly. */
    @Test
    void whenMainThenPrintMathPowResult() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathPow.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("9.0" + System.lineSeparator());
    }
}
