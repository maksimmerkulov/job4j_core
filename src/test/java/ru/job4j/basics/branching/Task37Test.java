package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task37} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task37Test {

    /** Verifies the case when digits are identical. */
    @Test
    void when11ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.numsCompare(11);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when the first digit is smaller. */
    @Test
    void when15ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.numsCompare(15);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when the first digit is larger. */
    @Test
    void when52ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.numsCompare(52);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }
}
