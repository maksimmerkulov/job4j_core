package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Game} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class GameTest {

    /** Verifies the case when the game is profitable. */
    @Test
    void whenProfitableThenPositive() {
        assertThat(Game.checkGame(0.2, 50, 9)).isEqualTo(1);
    }

    /** Verifies the case when the game is not profitable. */
    @Test
    void whenNotProfitableThenZero() {
        assertThat(Game.checkGame(0.9, 1, 2)).isZero();
    }
}
