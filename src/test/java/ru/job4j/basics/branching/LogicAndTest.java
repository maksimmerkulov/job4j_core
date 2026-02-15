package ru.job4j.basics.branching;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Модульные тесты класса {@link LogicAnd}.
 *
 * <p>Проверяется корректность работы метода {@link LogicAnd#check(int)}
 * для различных входных значений.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями:
 * {@code true} для положительных четных чисел
 * и {@code false} в остальных случаях.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicAndTest {

    /**
     * Проверяет метод {@link LogicAnd#check(int)} для отрицательного числа,
     * положительного нечетного и положительного четного числа.
     *
     * <p>Ожидаемый результат: {@code false} для {@code -1} и {@code 1},
     * {@code true} для {@code 2}.</p>
     */
    @Test
    public void test() {
        assertFalse(LogicAnd.check(-1));
        assertFalse(LogicAnd.check(1));
        assertTrue(LogicAnd.check(2));
    }
}
