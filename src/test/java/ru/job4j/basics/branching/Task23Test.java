package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task23} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task23Test {

    /** Verifies that a fraction with zero denominator does not exist. */
    @Test
    void when1And0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.isExist(1, 0);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies that a standard fraction exists. */
    @Test
    void when2And5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.isExist(2, 5);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies that a fraction with zero numerator exists. */
    @Test
    void when0And3ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.isExist(0, 3);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }
}
