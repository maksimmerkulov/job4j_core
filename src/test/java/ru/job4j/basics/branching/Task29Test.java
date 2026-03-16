package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task29} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task29Test {

    /** Verifies a classic {@code 3-4-5} right triangle. */
    @Test
    void when3And4And5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.triangleCheck(3, 4, 5);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case with incorrect side lengths. */
    @Test
    void when3And4dot1And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.triangleCheck(3, 4.1, 5);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a larger {@code 6-8-10} right triangle. */
    @Test
    void when6And8And10ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.triangleCheck(6, 8, 10);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies an impossible right triangle. */
    @Test
    void when2And2And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.triangleCheck(2, 2, 5);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
