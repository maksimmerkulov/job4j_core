package ru.job4j.basics.branching;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link GreatThen}.
 *
 * <p>Проверяется корректность работы метода {@link GreatThen#check(int, int)}
 * для различных комбинаций чисел.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями {@code true}
 * или {@code false}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class GreatThenTest {

    /**
     * Проверяет метод {@link GreatThen#check(int, int)} для случая,
     * когда первое число меньше второго.
     *
     * <p>Ожидаемый результат: {@code false}.</p>
     */
    @Test
    public void whenFirstLess() {
        assertThat(
                GreatThen.check(1, 2),
                is(false)
        );
    }

    /**
     * Проверяет метод {@link GreatThen#check(int, int)} для случая,
     * когда первое число больше второго.
     *
     * <p>Ожидаемый результат: {@code true}.</p>
     */
    @Test
    public void whenFirstGreat() {
        assertThat(
                GreatThen.check(10, 2),
                is(true)
        );
    }
}
