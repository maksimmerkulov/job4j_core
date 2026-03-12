package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link GreatThen} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class GreatThenTest {

    /** Verifies the case when the first number is less than the second. */
    @Test
    void whenFirstLessThenFalse() {
        assertThat(GreatThen.check(1, 2)).isFalse();
    }

    /** Verifies the case when the first number is greater than the second. */
    @Test
    void whenFirstGreaterThenTrue() {
        assertThat(GreatThen.check(10, 2)).isTrue();
    }
}
