package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task27} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task27Test {

    /** Verifies the case when there are not enough chairs. */
    @Test
    void when20And18ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.isEnough(20, 18);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when there are no chairs at all. */
    @Test
    void when10And0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.isEnough(10, 0);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /** Verifies the case when chairs are sufficient. */
    @Test
    void when18And20ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.isEnough(18, 20);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /** Verifies the case when there are no pupils but chairs are present. */
    @Test
    void when0And10ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.isEnough(0, 10);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }
}
