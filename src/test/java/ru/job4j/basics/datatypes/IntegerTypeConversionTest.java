package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link IntegerTypeConversion} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class IntegerTypeConversionTest {

    /** Verifies that the conversion results are printed correctly. */
    @Test
    void whenMainThenPrintConversionResults() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "1" + System.lineSeparator()
                        + "1" + System.lineSeparator()
        );
    }
}
