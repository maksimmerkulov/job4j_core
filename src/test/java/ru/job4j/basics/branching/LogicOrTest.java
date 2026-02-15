package ru.job4j.basics.branching;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Модульные тесты класса {@link LogicOr}.
 *
 * <p>Проверяется корректность работы метода {@link LogicOr#check(int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями {@code true}
 * и {@code false}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicOrTest {

    /**
     * Проверяет метод {@link LogicOr#check(int)} для различных чисел.
     *
     * <p>Ожидаемый результат: {@code false} для положительного четного числа,
     * {@code true} для положительного нечетного
     * и отрицательного четного числа.</p>
     */
    @Test
    public void test() {
        assertFalse(LogicOr.check(2));
        assertTrue(LogicOr.check(1));
        assertTrue(LogicOr.check(-2));
    }
}
