package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task46} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task46Test {

    /**
     * Verifies different numbers: {@code 17} increases, {@code 25} decreases.
     */
    @Test
    void when17And25Then18And24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(17, 25);
        assertThat(out.toString())
                .isEqualTo("18" + System.lineSeparator()
                        + "24" + System.lineSeparator());
    }

    /**
     * Verifies different numbers: {@code 512} decreases, {@code 256} increases.
     */
    @Test
    void when512And256Then511And257() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(512, 256);
        assertThat(out.toString())
                .isEqualTo("511" + System.lineSeparator()
                        + "257" + System.lineSeparator());
    }

    /**
     * Verifies equal numbers: both increase by {@code 1}.
     */
    @Test
    void when100And100Then101And101() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task46.changeNums(100, 100);
        assertThat(out.toString())
                .isEqualTo("101" + System.lineSeparator()
                        + "101" + System.lineSeparator());
    }
}
