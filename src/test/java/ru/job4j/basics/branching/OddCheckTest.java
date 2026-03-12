package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link OddCheck} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class OddCheckTest {

    /** Verifies the case when the number is even. */
    @Test
    void whenEvenThenFalse() {
        assertThat(OddCheck.check(2)).isFalse();
    }

    /** Verifies the case when the number is odd. */
    @Test
    void whenOddThenTrue() {
        assertThat(OddCheck.check(3)).isTrue();
    }
}
