package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link EvenCheck} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class EvenCheckTest {

    /** Verifies the case when the number is even. */
    @Test
    void whenEvenThenTrue() {
        assertThat(EvenCheck.check(2)).isTrue();
    }

    /** Verifies the case when the number is odd. */
    @Test
    void whenOddThenFalse() {
        assertThat(EvenCheck.check(3)).isFalse();
    }
}
