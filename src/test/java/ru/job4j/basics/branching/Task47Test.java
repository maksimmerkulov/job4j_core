package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task47} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task47Test {

    /** Verifies digit swap for number below {@code 500}. */
    @Test
    void when474Then447() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(474);
        assertThat(out.toString())
                .isEqualTo("447" + System.lineSeparator());
    }

    /** Verifies digit swap for number above {@code 500}. */
    @Test
    void when591Then195() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(591);
        assertThat(out.toString())
                .isEqualTo("195" + System.lineSeparator());
    }

    /** Verifies that {@code 100} remains {@code 100} after swap. */
    @Test
    void when100Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(100);
        assertThat(out.toString())
                .isEqualTo("100" + System.lineSeparator());
    }

    /** Verifies swap for {@code 590} resulting in {@code 95}. */
    @Test
    void when590Then95() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(590);
        assertThat(out.toString())
                .isEqualTo("95" + System.lineSeparator());
    }

    /** Verifies that the boundary value {@code 500} is handled. */
    @Test
    void when500Then500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(500);
        assertThat(out.toString())
                .isEqualTo("500" + System.lineSeparator());
    }

    /** Verifies swap for {@code 600} resulting in {@code 6}. */
    @Test
    void when600Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task47.changeNum(600);
        assertThat(out.toString())
                .isEqualTo("6" + System.lineSeparator());
    }
}
