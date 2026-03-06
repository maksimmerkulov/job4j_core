package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task15} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task15Test {

    /** Verifies the sequence for input {@code 6}. */
    @Test
    void whenInput6ThenReturn8And10And12() {
        assertThat(Task15.increaseBy2(6)).isEqualTo("8, 10, 12");
    }

    /** Verifies the sequence for input {@code 3}. */
    @Test
    void whenInput3ThenReturn5And7And9() {
        assertThat(Task15.increaseBy2(3)).isEqualTo("5, 7, 9");
    }

    /** Verifies the sequence for input {@code 0}. */
    @Test
    void whenInput0ThenReturn2And4And6() {
        assertThat(Task15.increaseBy2(0)).isEqualTo("2, 4, 6");
    }

    /** Verifies the sequence for negative input {@code -10}. */
    @Test
    void whenInputMinus10ThenReturnMinus8AndMinus6AndMinus4() {
        assertThat(Task15.increaseBy2(-10)).isEqualTo("-8, -6, -4");
    }
}
