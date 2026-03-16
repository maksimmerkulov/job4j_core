package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task26} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task26Test {

    /** Verifies that identical positive numbers are equal. */
    @Test
    void when1And1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 1);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that different positive numbers are not equal. */
    @Test
    void when1And2ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 2);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies that zeros are equal. */
    @Test
    void when0And0ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(0, 0);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that identical negative numbers are equal. */
    @Test
    void whenMinus1AndMinus1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, -1);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that numbers with different signs are not equal. */
    @Test
    void whenMinus1And1ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, 1);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
