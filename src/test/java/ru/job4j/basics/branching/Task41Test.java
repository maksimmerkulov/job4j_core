package ru.job4j.basics.branching;

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

    /**
     * Verifies the amount of even digits for {@code 100}:
     * {@code 1} is odd, {@code 0} is even, {@code 0} is even.
     */
    @Test
    void when100Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.evenDigitsAmount(100);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /**
     * Verifies that {@code 111} has {@code 0} even digits.
     */
    @Test
    void when111Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.evenDigitsAmount(111);
        assertThat(out.toString())
                .isEqualTo("0" + System.lineSeparator());
    }

    /**
     * Verifies that {@code 222} has {@code 3} even digits.
     */
    @Test
    void when222Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.evenDigitsAmount(222);
        assertThat(out.toString())
                .isEqualTo("3" + System.lineSeparator());
    }

    /**
     * Verifies the amount of even digits for {@code 212}:
     * {@code 2} is even, {@code 1} is odd, {@code 2} is even.
     */
    @Test
    void when212Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.evenDigitsAmount(212);
        assertThat(out.toString())
                .isEqualTo("2" + System.lineSeparator());
    }

    /**
     * Verifies that {@code 112} has only {@code 1} even digit.
     */
    @Test
    void when112Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.evenDigitsAmount(112);
        assertThat(out.toString())
                .isEqualTo("1" + System.lineSeparator());
    }
}
