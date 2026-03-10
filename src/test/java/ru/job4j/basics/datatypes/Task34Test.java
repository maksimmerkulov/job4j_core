package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task34} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task34Test {

    /** Verifies the result for {@code 3634}. */
    @Test
    void when3634Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(3634);
        assertThat(out.toString()).isEqualTo("2" + System.lineSeparator());
    }

    /** Verifies the result for {@code 2468}. */
    @Test
    void when2468Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(2468);
        assertThat(out.toString()).isEqualTo("4" + System.lineSeparator());
    }

    /** Verifies the result for {@code 1357}. */
    @Test
    void when1357Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(1357);
        assertThat(out.toString()).isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies the result for {@code 2009}. */
    @Test
    void when2009Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(2009);
        assertThat(out.toString()).isEqualTo("3" + System.lineSeparator());
    }

    /** Verifies the result for {@code 3590}. */
    @Test
    void when3590Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(3590);
        assertThat(out.toString()).isEqualTo("1" + System.lineSeparator());
    }
}
