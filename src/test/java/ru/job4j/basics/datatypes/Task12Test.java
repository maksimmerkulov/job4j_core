package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task12}.
 *
 * <p>Проверяется корректность работы конвертации длины из дюймов в сантиметры
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями с точностью до двух знаков
 * после запятой.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task12Test {

    /**
     * Проверяет перевод {@code 1} дюйма в сантиметры.
     *
     * <p>Ожидаемый результат: {@code 2.54}.</p>
     */
    @Test
    public void when1InchThen2dot54CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "2.54";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 25} дюймов в сантиметры.
     *
     * <p>Ожидаемый результат: {@code 63.50}.</p>
     */
    @Test
    public void when25InchesThen63dot5CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("25".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "63.50";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 96} дюймов в сантиметры.
     *
     * <p>Ожидаемый результат: {@code 243.84}.</p>
     */
    @Test
    public void when96InchesThen243dot84CM() {
        ByteArrayInputStream in = new ByteArrayInputStream("96".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task12.main(null);
        String expected = "243.84";
        assertThat(out.toString(), is(expected));
    }
}
