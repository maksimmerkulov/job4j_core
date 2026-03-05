package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MathSqrt} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MathSqrtTest {

    /** Verifies that the square root result is printed correctly. */
    @Test
    void whenMainThenPrintSquareRootResult() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathSqrt.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("3.0" + System.lineSeparator());
    }
}
