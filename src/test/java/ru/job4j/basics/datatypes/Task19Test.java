package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task19} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task19Test {

    /** Verifies sum and conversion for {@code 5000, 7000, 0.016516}. */
    @Test
    void whenInput5000And7000AndRate0Point016516ThenPrint198Point19() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(5000, 7000, 0.016516);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("198.19");
    }

    /** Verifies sum and conversion for {@code 1500, 10000, 0.019}. */
    @Test
    void whenInput1500And10000AndRate0Point019ThenPrint218Point50() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(1500, 10000, 0.019);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("218.50");
    }

    /** Verifies sum and conversion for {@code 550, 100, 0.01954}. */
    @Test
    void whenInput550And100AndRate0Point01954ThenPrint12Point70() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(550, 100, 0.01954);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("12.70");
    }
}
