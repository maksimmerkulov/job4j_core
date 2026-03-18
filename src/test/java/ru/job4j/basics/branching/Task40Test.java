package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task40} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task40Test {

    /**
     * Verifies a double even number: {@code 336} is even
     * and sum {@code 12} is even.
     */
    @Test
    void when336ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(336);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies a double even number: {@code 158} is even
     * and sum {@code 14} is even.
     */
    @Test
    void when158ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(158);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies a double even number: {@code 990} is even
     * and sum {@code 18} is even.
     */
    @Test
    void when990ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(990);
        assertThat(out.toString())
                .isEqualTo("Yes" + System.lineSeparator());
    }

    /**
     * Verifies when {@code 108} is even, but sum of digits {@code 9} is odd.
     */
    @Test
    void when108ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(108);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /**
     * Verifies when {@code 980} is even, but sum of digits {@code 17} is odd.
     */
    @Test
    void when980ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(980);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /**
     * Verifies an odd number {@code 363} with even sum of digits {@code 12}.
     */
    @Test
    void when363ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(363);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }

    /**
     * Verifies a fully odd number {@code 111} with odd sum {@code 3}.
     */
    @Test
    void when111ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.isDoubleEven(111);
        assertThat(out.toString())
                .isEqualTo("No" + System.lineSeparator());
    }
}
