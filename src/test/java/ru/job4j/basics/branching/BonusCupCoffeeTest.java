package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link BonusCupCoffee} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class BonusCupCoffeeTest {

    /** Verifies the case when only one bonus cup is earned. */
    @Test
    void whenOneBonusThenEight() {
        assertThat(BonusCupCoffee.countCup(7, 6)).isEqualTo(8);
    }

    /** Verifies the case with a large number of cups and multiple bonuses. */
    @Test
    void whenManyBonusesThenTwoHundredFortyEight() {
        assertThat(BonusCupCoffee.countCup(213, 6)).isEqualTo(248);
    }
}
