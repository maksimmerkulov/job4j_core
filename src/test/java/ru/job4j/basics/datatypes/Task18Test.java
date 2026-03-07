package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task18} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task18Test {

    /**
     * Verifies prize points for {@code 1} ten, {@code 2} hundreds,
     * and {@code 3} thousands caps.
     */
    @Test
    void whenInput1And2And3ThenReturn3210() {
        assertThat(Task18.capSum(1, 2, 3)).isEqualTo(3210);
    }

    /**
     * Verifies prize points for zero caps.
     */
    @Test
    void whenInput0And0And0ThenReturn0() {
        assertThat(Task18.capSum(0, 0, 0)).isEqualTo(0);
    }

    /**
     * Verifies prize points for only one hundred-point cap.
     */
    @Test
    void whenInput0And1And0ThenReturn100() {
        assertThat(Task18.capSum(0, 1, 0)).isEqualTo(100);
    }

    /**
     * Verifies prize points for {@code 6} tens, {@code 2} hundreds,
     * and {@code 1} a thousand caps.
     */
    @Test
    void whenInput6And2And1ThenReturn1260() {
        assertThat(Task18.capSum(6, 2, 1)).isEqualTo(1260);
    }
}
