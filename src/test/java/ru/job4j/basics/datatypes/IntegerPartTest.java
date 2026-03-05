package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link IntegerPart} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class IntegerPartTest {

    /** Verifies that the integer part is extracted and printed correctly. */
    @Test
    void whenMainThenPrintIntegerPart() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerPart.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("2" + System.lineSeparator());
    }
}
