package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task22} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task22Test {

    /** Verifies the case with two real roots. */
    @Test
    void when1Minus1AndMinus6ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.haveRoots(1, -1, -6);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case with exactly one real root. */
    @Test
    void when1And2And1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.haveRoots(1, 2, 1);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case with no real roots. */
    @Test
    void when7Minus1And2ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.haveRoots(7, -1, 2);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
