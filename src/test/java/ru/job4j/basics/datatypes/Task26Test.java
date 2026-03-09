package ru.job4j.basics.datatypes;

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

    /** Verifies transformation of {@code 37}. */
    @Test
    void when37Then81() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(37);
        assertThat(out.toString())
                .isEqualTo("81" + System.lineSeparator());
    }

    /** Verifies transformation of {@code 49}. */
    @Test
    void when49Then102() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(49);
        assertThat(out.toString())
                .isEqualTo("102" + System.lineSeparator());
    }

    /** Verifies transformation of {@code 10}. */
    @Test
    void when10Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(10);
        assertThat(out.toString())
                .isEqualTo("9" + System.lineSeparator());
    }
}
