package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link NegativeCondition} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class NegativeConditionTest {

    /** Verifies logical conditions for a negative number. */
    @Test
    void whenNumIsMinusOneThenTrueAndFalse() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        NegativeCondition.main(null);
        assertThat(out.toString()).isEqualTo(
                "true" + System.lineSeparator()
                        + "false" + System.lineSeparator()
        );
    }
}
