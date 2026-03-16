package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task32} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task32Test {

    /** Verifies the difference when the second number is larger. */
    @Test
    void when1And3Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.calculate(1, 3);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the difference when the first number is larger. */
    @Test
    void when5And2Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.calculate(5, 2);
        assertThat(out.toString())
                .isEqualTo("3" + System.lineSeparator());
    }

    /** Verifies the product when numbers are equal. */
    @Test
    void when3And3Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.calculate(3, 3);
        assertThat(out.toString())
                .isEqualTo("9" + System.lineSeparator());
    }
}
