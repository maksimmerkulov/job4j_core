package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task41} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task41Test {

    /** Verifies circular right shift for {@code 123}. */
    @Test
    void when123Then312() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(123);
        assertThat(out.toString())
                .isEqualTo("312" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 120}. */
    @Test
    void when120Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(120);
        assertThat(out.toString())
                .isEqualTo("12" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 100}. */
    @Test
    void when100Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(100);
        assertThat(out.toString())
                .isEqualTo("10" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 106}. */
    @Test
    void when106Then610() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(106);
        assertThat(out.toString())
                .isEqualTo("610" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 111}. */
    @Test
    void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(111);
        assertThat(out.toString())
                .isEqualTo("111" + System.lineSeparator());
    }

    /** Verifies circular right shift for {@code 121}. */
    @Test
    void when121Then112() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(121);
        assertThat(out.toString())
                .isEqualTo("112" + System.lineSeparator());
    }
}
