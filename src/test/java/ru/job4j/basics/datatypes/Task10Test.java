package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task10}.
 *
 * <p>Проверяется корректность перевода температуры из Фаренгейтов в Цельсии
 * методом {@link Task10#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями,
 * выводимыми в стандартный поток вывода.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task10Test {

    /**
     * Проверяет перевод температуры {@code 90°F}.
     *
     * <p>Ожидаемый результат: {@code 32.2}.</p>
     */
    @Test
    public void whenF90ThenC32dot2() {
        ByteArrayInputStream in = new ByteArrayInputStream("90".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "32.2";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод температуры {@code 10°F}.
     *
     * <p>Ожидаемый результат: {@code -12.2}.</p>
     */
    @Test
    public void whenF10ThenCMinus12dot2() {
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "-12.2";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод температуры {@code -123°F}.
     *
     * <p>Ожидаемый результат: {@code -86.1}.</p>
     */
    @Test
    public void whenFMinus123ThenCMinus86dot1() {
        ByteArrayInputStream in = new ByteArrayInputStream("-123".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task10.main(null);
        String expected = "-86.1";
        assertThat(out.toString(), is(expected));
    }
}
