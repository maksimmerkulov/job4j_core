package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link ShortType} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class ShortTypeTest {

    /**
     * Verifies that the {@code short} value {@code 4}
     * is read and printed correctly.
     */
    @Test
    void whenInput4ThenPrint4() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        ShortType.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("4" + System.lineSeparator());
    }

    /**
     * Verifies that the {@code short} value {@code 5}
     * is read and printed correctly.
     */
    @Test
    void whenInput5ThenPrint5() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        ShortType.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("5" + System.lineSeparator());
    }
}
