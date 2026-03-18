package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task39} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task39Test {

    /** Verifies a symmetric three-digit number. */
    @Test
    void when323ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.isSymmetric(323);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a symmetric number with a zero in the middle. */
    @Test
    void when505ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.isSymmetric(505);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies a non-symmetric number where only first two digits are same. */
    @Test
    void when550ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.isSymmetric(550);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies a non-symmetric number ending with zero. */
    @Test
    void when500ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.isSymmetric(500);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
