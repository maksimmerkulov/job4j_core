package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task14} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task14Test {

    /** Verifies calculations for inputs {@code 3.0 4.0 5.0}. */
    @Test
    void whenInput3And4And5ThenPrint12And6() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("3.0 4.0 5.0".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("12.0" + System.lineSeparator() + "6.0");
    }

    /** Verifies calculations for inputs {@code 2.4 8.5 8.8}. */
    @Test
    void whenInput2Point4And8Point5And8Point8ThenPrint19Point7And10Point2() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("2.4 8.5 8.8".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("19.7" + System.lineSeparator() + "10.2");
    }

    /** Verifies calculations for inputs {@code 5.0 7.0 8.6}. */
    @Test
    void whenInput5And7And8Point6ThenPrint20Point6And17Point5() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("5.0 7.0 8.6".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("20.6" + System.lineSeparator() + "17.5");
    }
}
