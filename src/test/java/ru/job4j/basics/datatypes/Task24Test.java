package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task24} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task24Test {

    /** Verifies expanded form for input {@code 35}. */
    @Test
    void whenInput35ThenPrint30Plus5() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(35);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("30+5" + System.lineSeparator());
    }

    /** Verifies expanded form for input {@code 19}. */
    @Test
    void whenInput19ThenPrint10Plus9() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(19);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("10+9" + System.lineSeparator());
    }

    /** Verifies expanded form for input {@code 63}. */
    @Test
    void whenInput63ThenPrint60Plus3() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(63);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("60+3" + System.lineSeparator());
    }
}
