package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task48} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task48Test {

    /** Verifies product for even {@code num1} (2 * 2.5 = 5.0). */
    @Test
    void when2And2dot5And3Then5dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(2, 2.5, 3);
        assertThat(out.toString())
                .isEqualTo("5.0" + System.lineSeparator());
    }

    /** Verifies product for even {@code num1} (4 * 1.5 = 6.0). */
    @Test
    void when4And1dot5And5Then6dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(4, 1.5, 5);
        assertThat(out.toString())
                .isEqualTo("6.0" + System.lineSeparator());
    }

    /** Verifies sum for odd {@code num1} (3 + 4 = 7). */
    @Test
    void when3And3dot5And4Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(3, 3.5, 4);
        assertThat(out.toString())
                .isEqualTo("7" + System.lineSeparator());
    }

    /** Verifies sum for odd {@code num1} (1 + 5 = 6). */
    @Test
    void when1And4dot5And5Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.changeNum(1, 4.5, 5);
        assertThat(out.toString())
                .isEqualTo("6" + System.lineSeparator());
    }
}
