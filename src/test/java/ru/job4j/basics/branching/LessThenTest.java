package ru.job4j.basics.branching;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link LessThen}.
 *
 * <p>Проверяется корректность работы метода {@link LessThen#check(int, int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями типа {@code boolean}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LessThenTest {

    /**
     * Проверяет метод {@link LessThen#check(int, int)} для случая,
     * когда первое число меньше второго.
     *
     * <p>Ожидаемый результат: {@code true}.</p>
     */
    @Test
    public void whenFirstLess() {
        assertThat(
                LessThen.check(1, 2),
                is(true)
        );
    }

    /**
     * Проверяет метод {@link LessThen#check(int, int)} для случая,
     * когда первое число больше второго.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenFirstGreat() {
        assertThat(
                LessThen.check(10, 2),
                is(false)
        );
    }
}
