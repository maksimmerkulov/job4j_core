package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link IfBracket} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class IfBracketTest {

    /** Verifies that both A and B are displayed when the condition is met. */
    @Test
    void whenTwoThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(2);
        assertThat(out.toString()).isEqualTo(
                "A" + System.lineSeparator()
                        + "B" + System.lineSeparator()
        );
    }

    /** Verifies that nothing is displayed when the condition is not met. */
    @Test
    void whenZeroThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(0);
        assertThat(out.toString()).isEmpty();
    }
}
