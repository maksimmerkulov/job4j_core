package ru.job4j.basics.branching;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Game}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Game#checkGame(double, int, int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями для случаев,
 * когда игра выгодна и когда невыгодна.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class GameTest {

    /**
     * Проверяет метод {@link Game#checkGame(double, int, int)} для случая,
     * когда игра приносит прибыль.
     *
     * <p>Ожидаемый результат: положительное значение чистой прибыли.</p>
     */
    @Test
    public void checkGame() {
        int rsl = Game.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }

    /**
     * Проверяет метод {@link Game#checkGame(double, int, int)} для случая,
     * когда игра не приносит прибыли.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void checkGameIs0() {
        int rsl = Game.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));
    }
}
