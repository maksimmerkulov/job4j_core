package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link LogicAnd} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class LogicAndTest {

    /** Verifies the case when the number is negative. */
    @Test
    void whenMinusOneThenFalse() {
        assertThat(LogicAnd.check(-1)).isFalse();
    }

    /** Verifies the case when the number is positive but odd. */
    @Test
    void whenOneThenFalse() {
        assertThat(LogicAnd.check(1)).isFalse();
    }

    /** Verifies the case when the number is positive and even. */
    @Test
    void whenTwoThenTrue() {
        assertThat(LogicAnd.check(2)).isTrue();
    }
}
