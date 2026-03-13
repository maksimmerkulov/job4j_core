package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task15} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task15Test {

    /** Verifies that a positive number is doubled. */
    @Test
    void when4Then8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(4);
        assertThat(out.toString()).isEqualTo("8" + System.lineSeparator());
    }

    /** Verifies that a negative number is printed as is. */
    @Test
    void whenMinus4ThenMinus4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(-4);
        assertThat(out.toString()).isEqualTo("-4" + System.lineSeparator());
    }

    /** Verifies that zero is printed as is. */
    @Test
    void when0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(0);
        assertThat(out.toString()).isEqualTo("0" + System.lineSeparator());
    }

    /** Verifies doubling for a larger positive number. */
    @Test
    void when111Then222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(111);
        assertThat(out.toString()).isEqualTo("222" + System.lineSeparator());
    }
}
