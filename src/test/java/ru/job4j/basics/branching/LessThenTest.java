package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link LessThen} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class LessThenTest {

    /** Verifies the case when the first number is less than the second. */
    @Test
    void whenFirstLessThenTrue() {
        assertThat(LessThen.check(1, 2)).isTrue();
    }

    /** Verifies the case when the first number is greater than the second. */
    @Test
    void whenFirstGreaterThenFalse() {
        assertThat(LessThen.check(10, 2)).isFalse();
    }
}
