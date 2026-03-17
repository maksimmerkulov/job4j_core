package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task34} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task34Test {

    /** Verifies the case when there are not enough chairs. */
    @Test
    void when12And10ThenMissing2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(12, 10);
        assertThat(out.toString())
                .isEqualTo("Missing chairs: 2" + System.lineSeparator());
    }

    /** Verifies the case when there are extra chairs. */
    @Test
    void when10And15ThenExtra5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(10, 15);
        assertThat(out.toString())
                .isEqualTo("Extra chairs: 5" + System.lineSeparator());
    }

    /** Verifies the case when chairs match pupils. */
    @Test
    void when10And10ThenMatches() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(10, 10);
        assertThat(out.toString())
                .isEqualTo("Matches" + System.lineSeparator());
    }
}
