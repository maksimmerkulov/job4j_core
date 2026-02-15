package ru.job4j.basics.branching;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Модульные тесты класса {@link EvenCheck}.
 *
 * <p>Проверяется корректность работы метода {@link EvenCheck#check(int)}
 * для различных целых чисел.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями
 * {@code true} для четных чисел и {@code false} для нечетных чисел.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class EvenCheckTest {

    /**
     * Проверяет метод {@link EvenCheck#check(int)} для положительного случая.
     *
     * <p>Ожидаемый результат: {@code true} для четного числа.</p>
     */
    @Test
    public void whenEvenThenTrue() {
        assertTrue(EvenCheck.check(2));
    }

    /**
     * Проверяет метод {@link EvenCheck#check(int)} для отрицательного случая.
     *
     * <p>Ожидаемый результат: {@code false} для нечетного числа.</p>
     */
    @Test
    public void whenOddThenFalse() {
        assertFalse(EvenCheck.check(3));
    }
}
