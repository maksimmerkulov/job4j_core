package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link DivMod} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class DivModTest {

    /** Verifies that the division and modulo results are printed correctly. */
    @Test
    void whenMainThenPrintDivisionAndModuloResults() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        DivMod.main(null);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo(
                "3" + System.lineSeparator()
                        + "2" + System.lineSeparator()
        );
    }
}
