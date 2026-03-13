package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link ShortCircuitAnd} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class ShortCircuitAndTest {

    /** Verifies that only {@code A} is printed due to short-circuiting. */
    @Test
    void whenMainThenOnlyA() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ShortCircuitAnd.main(null);
        assertThat(out.toString()).isEqualTo("A" + System.lineSeparator());
    }
}
