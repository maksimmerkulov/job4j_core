package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task31} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task31Test {

    /** Verifies the order when the first number is smaller. */
    @Test
    void when1And2Then12And21() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(1, 2);
        assertThat(out.toString()).isEqualTo(
                "1 2" + System.lineSeparator() + "2 1" + System.lineSeparator()
        );
    }

    /** Verifies the order when the first number is larger. */
    @Test
    void when2And1Then12And21() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(2, 1);
        assertThat(out.toString()).isEqualTo(
                "1 2" + System.lineSeparator() + "2 1" + System.lineSeparator()
        );
    }

    /** Verifies the order with a negative number. */
    @Test
    void whenMinus2And1ThenMinus21And1Minus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(-2, 1);
        assertThat(out.toString()).isEqualTo(
                "-2 1" + System.lineSeparator() + "1 -2" + System.lineSeparator()
        );
    }

    /** Verifies the order with {@code 0} and a positive number. */
    @Test
    void when1And0Then01And10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(1, 0);
        assertThat(out.toString()).isEqualTo(
                "0 1" + System.lineSeparator() + "1 0" + System.lineSeparator()
        );
    }

    /** Verifies the order with {@code 0} and a negative number. */
    @Test
    void when0AndMinus1ThenMinus10And0Minus1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.numCompare(0, -1);
        assertThat(out.toString()).isEqualTo(
                "-1 0" + System.lineSeparator() + "0 -1" + System.lineSeparator()
        );
    }
}
