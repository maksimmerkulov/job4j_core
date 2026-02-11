package ru.job4j.basics.datatypes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task18}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task18#capSum(int, int, int)}
 * при формировании числа из разрядов десятков, сотен и тысяч.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми целочисленными значениями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18Test {

    /**
     * Проверяет метод {@link Task18#capSum(int, int, int)}
     * для стандартного набора значений.
     *
     * <p>Ожидаемый результат: {@code 3210}.</p>
     */
    @Test
    public void when1And2And3Then3210() {
        int rsl = Task18.capSum(1, 2, 3);
        int expected = 3210;
        assertThat(rsl, is(expected));
    }

    /**
     * Проверяет метод {@link Task18#capSum(int, int, int)}
     * для случая всех нулевых значений.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void whenAllZeros() {
        int rsl = Task18.capSum(0, 0, 0);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    /**
     * Проверяет метод {@link Task18#capSum(int, int, int)}
     * при наличии только сотен.
     *
     * <p>Ожидаемый результат: {@code 100}.</p>
     */
    @Test
    public void when0And1And0Then100() {
        int rsl = Task18.capSum(0, 1, 0);
        int expected = 100;
        assertThat(rsl, is(expected));
    }

    /**
     * Проверяет метод {@link Task18#capSum(int, int, int)}
     * для произвольного набора значений.
     *
     * <p>Ожидаемый результат: {@code 1260}.</p>
     */
    @Test
    public void when6And2And1Then1260() {
        int rsl = Task18.capSum(6, 2, 1);
        int expected = 1260;
        assertThat(rsl, is(expected));
    }
}
