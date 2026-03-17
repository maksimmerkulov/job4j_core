package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task35} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task35Test {

    /** Verifies the lower boundary of a valid grade. */
    @Test
    void when1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(1);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a middle valid grade. */
    @Test
    void when3ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(3);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the upper boundary of a valid grade. */
    @Test
    void when5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(5);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a value just below the valid range. */
    @Test
    void when0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(0);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a value just above the valid range. */
    @Test
    void when6ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(6);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a negative value. */
    @Test
    void whenMinus6ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.gradeCheck(-6);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
