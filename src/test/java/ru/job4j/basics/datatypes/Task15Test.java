package ru.job4j.basics.datatypes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task15}.
 *
 * <p>Проверяется корректность работы метода {@link Task15#increaseBy2(int)}
 * при последовательном увеличении числа на {@code 2} — три раза.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми строковыми значениями,
 * представляющими последовательность увеличений.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15Test {

    /**
     * Проверяет увеличение числа {@code 6} на {@code 2} три раза.
     *
     * <p>Ожидаемый результат: {@code 8, 10, 12}.</p>
     */
    @Test
    public void when6Then8And10And12() {
        String expected = "8, 10, 12";
        assertThat(Task15.increaseBy2(6), is(expected));
    }

    /**
     * Проверяет увеличение числа {@code 3} на {@code 2} три раза.
     *
     * <p>Ожидаемый результат: {@code 5, 7, 9}.</p>
     */
    @Test
    public void when3Then5And7And9() {
        String expected = "5, 7, 9";
        assertThat(Task15.increaseBy2(3), is(expected));
    }

    /**
     * Проверяет увеличение числа {@code 0} на {@code 2} три раза.
     *
     * <p>Ожидаемый результат: {@code 2, 4, 6}.</p>
     */
    @Test
    public void when0Then2And4And6() {
        String expected = "2, 4, 6";
        assertThat(Task15.increaseBy2(0), is(expected));
    }

    /**
     * Проверяет увеличение числа {@code -10} на {@code 2} три раза.
     *
     * <p>Ожидаемый результат: {@code -8, -6, -4}.</p>
     */
    @Test
    public void whenMinus10ThenMinus8AndMinus6AndMinus4() {
        String expected = "-8, -6, -4";
        assertThat(Task15.increaseBy2(-10), is(expected));
    }
}
