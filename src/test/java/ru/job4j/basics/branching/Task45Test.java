package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task45} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task45Test {

    /** Verifies decreasing an odd number {@code 23} to {@code 20}. */
    @Test
    void when23ThenDecreased20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(23);
        assertThat(out.toString())
                .isEqualTo("Decreased to 20" + System.lineSeparator());
    }

    /** Verifies decreasing an odd number {@code 339} to {@code 330}. */
    @Test
    void when339ThenDecreased330() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(339);
        assertThat(out.toString())
                .isEqualTo("Decreased to 330" + System.lineSeparator());
    }

    /** Verifies increasing an even number {@code 272} to {@code 280}. */
    @Test
    void when272ThenIncreased280() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(272);
        assertThat(out.toString())
                .isEqualTo("Increased to 280" + System.lineSeparator());
    }

    /** Verifies that a round number {@code 20} remains unchanged. */
    @Test
    void when20ThenNoChanges() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(20);
        assertThat(out.toString())
                .isEqualTo("No changes" + System.lineSeparator());
    }
}
