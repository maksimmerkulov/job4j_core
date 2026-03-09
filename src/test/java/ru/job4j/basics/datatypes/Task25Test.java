package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task25} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task25Test {

    /** Verifies decomposition of {@code 335}. */
    @Test
    void when335Then300Plus30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(335);
        assertThat(out.toString())
                .isEqualTo("300+30+5" + System.lineSeparator());
    }

    /** Verifies decomposition of {@code 760}. */
    @Test
    void when760Then700Plus60Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(760);
        assertThat(out.toString())
                .isEqualTo("700+60+0" + System.lineSeparator());
    }

    /** Verifies decomposition of {@code 100}. */
    @Test
    void when100Then100Plus0Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(100);
        assertThat(out.toString())
                .isEqualTo("100+0+0" + System.lineSeparator());
    }

    /** Verifies decomposition of {@code 109}. */
    @Test
    void when109Then100Plus0Plus9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(109);
        assertThat(out.toString())
                .isEqualTo("100+0+9" + System.lineSeparator());
    }
}
