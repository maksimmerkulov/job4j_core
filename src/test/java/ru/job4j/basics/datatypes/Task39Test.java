package ru.job4j.basics.datatypes;

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

    /** Verifies circular left shift for {@code 123}. */
    @Test
    void when123Then231() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(123);
        assertThat(out.toString())
                .isEqualTo("231" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 120}. */
    @Test
    void when120Then201() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(120);
        assertThat(out.toString())
                .isEqualTo("201" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 100}. */
    @Test
    void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(100);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 106}. */
    @Test
    void when106Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(106);
        assertThat(out.toString())
                .isEqualTo("61" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 111}. */
    @Test
    void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(111);
        assertThat(out.toString())
                .isEqualTo("111" + System.lineSeparator());
    }

    /** Verifies circular left shift for {@code 121}. */
    @Test
    void when121Then211() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(121);
        assertThat(out.toString())
                .isEqualTo("211" + System.lineSeparator());
    }
}
