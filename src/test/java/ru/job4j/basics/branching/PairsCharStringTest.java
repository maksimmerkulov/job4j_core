package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link PairsCharString} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class PairsCharStringTest {

    /** Verifies that two empty strings return {@code true}. */
    @Test
    void whenEmptyAndEmptyThenTrue() {
        boolean rsl = PairsCharString.check("", "");
        assertThat(rsl).isTrue();
    }

    /** Verifies a special pair where first/last characters match. */
    @Test
    void whenSparklingAndGroupsThenTrue() {
        boolean rsl = PairsCharString.check("sparkling", "groups");
        assertThat(rsl).isTrue();
    }

    /** Verifies that different strings return {@code false}. */
    @Test
    void whenBookingAndGrabberThenFalse() {
        boolean rsl = PairsCharString.check("booking", "grabber");
        assertThat(rsl).isFalse();
    }

    /** Verifies match failure when only one side matches. */
    @Test
    void whenEagleAndLikeThenFalse() {
        boolean rsl = PairsCharString.check("eagle", "like");
        assertThat(rsl).isFalse();
    }
}
