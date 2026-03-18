package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task42} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task42Test {

    /**
     * Verifies symmetric identical pairs like {@code 2222}.
     */
    @Test
    void when2222ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(2222);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies symmetric pairs with zero like {@code 2020}.
     */
    @Test
    void when2020ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(2020);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies symmetric different digits pairs like {@code 6363}.
     */
    @Test
    void when6363ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(6363);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies that {@code 1001} is not pair symmetric
     * ({@code 10} is not equal to {@code 01}).
     */
    @Test
    void when1001ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1001);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /**
     * Verifies non-symmetric pairs {@code 1011}.
     */
    @Test
    void when1011ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1011);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /**
     * Verifies non-symmetric pairs ending with zero like {@code 1000}.
     */
    @Test
    void when1000ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.isPairSymmetric(1000);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
