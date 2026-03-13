package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link LeapYear} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class LeapYearTest {

    /** Verifies a non-leap year. */
    @Test
    void when2019ThenFalse() {
        assertThat(LeapYear.checkYear(2019)).isFalse();
    }

    /** Verifies a century that is not a leap year. */
    @Test
    void when1800ThenFalse() {
        assertThat(LeapYear.checkYear(1800)).isFalse();
    }

    /** Verifies a standard leap year. */
    @Test
    void when2020ThenTrue() {
        assertThat(LeapYear.checkYear(2020)).isTrue();
    }

    /** Verifies a century that is a leap year. */
    @Test
    void when2000ThenTrue() {
        assertThat(LeapYear.checkYear(2000)).isTrue();
    }
}
