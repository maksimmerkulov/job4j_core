package ru.job4j.basics.branching;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Модульные тесты класса {@link OddCheck}.
 *
 * <p>Проверяется корректность работы метода {@link OddCheck#check(int)}
 * для четных и нечетных чисел.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями:
 * {@code true} для нечетных чисел и {@code false} для четных чисел.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OddCheckTest {

    /**
     * Проверяет метод {@link OddCheck#check(int)} для случая четного числа.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenEvenThenFalse() {
        assertFalse(OddCheck.check(2));
    }

    /**
     * Проверяет метод {@link OddCheck#check(int)} для случая нечетного числа.
     *
     * <p>Ожидаемый результат: {@code true}.</p>
     */
    @Test
    public void whenOddThenTrue() {
        assertTrue(OddCheck.check(3));
    }
}
