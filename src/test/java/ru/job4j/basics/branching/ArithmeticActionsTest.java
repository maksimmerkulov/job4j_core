package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link ArithmeticActions} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class ArithmeticActionsTest {

    /** Verifies the addition case. */
    @Test
    void when5And10Result15ThenAdded() {
        assertThat(ArithmeticActions.selectAction(5, 10, 15))
                .isEqualTo("added");
    }

    /** Verifies the subtraction case. */
    @Test
    void when10And5Result5ThenSubtracted() {
        assertThat(ArithmeticActions.selectAction(10, 5, 5))
                .isEqualTo("subtracted");
    }

    /** Verifies the multiplication case. */
    @Test
    void when3And5Result15ThenMultiplied() {
        assertThat(ArithmeticActions.selectAction(3, 5, 15))
                .isEqualTo("multiplied");
    }

    /** Verifies the division case. */
    @Test
    void when15And5Result3ThenDivided() {
        assertThat(ArithmeticActions.selectAction(15, 5, 3))
                .isEqualTo("divided");
    }

    /** Verifies the case when no arithmetic action matches. */
    @Test
    void when1And10Result100ThenNone() {
        assertThat(ArithmeticActions.selectAction(1, 10, 100))
                .isEqualTo("none");
    }
}
