package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link LogicOr} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class LogicOrTest {

    /** Verifies the case when the number is positive and even. */
    @Test
    void whenTwoThenFalse() {
        assertThat(LogicOr.check(2)).isFalse();
    }

    /** Verifies the case when the number is positive and odd. */
    @Test
    void whenOneThenTrue() {
        assertThat(LogicOr.check(1)).isTrue();
    }

    /** Verifies the case when the number is negative and even. */
    @Test
    void whenMinusTwoThenTrue() {
        assertThat(LogicOr.check(-2)).isTrue();
    }
}
