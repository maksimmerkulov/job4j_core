package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task13}.
 *
 * <p>Проверяется корректность работы программы {@link Task13}
 * при конвертации долларов США в другую валюту по заданному курсу.</p>
 *
 * <p>Результаты проверяются с точностью до двух знаков после запятой.
 * Для тестирования используется перенаправление потоков ввода и вывода
 * с помощью {@link ByteArrayInputStream} и {@link ByteArrayOutputStream}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task13Test {

    /**
     * Проверяет перевод {@code 15} долларов по курсу {@code 60.85}.
     *
     * <p>Ожидаемый результат: {@code 912.75}.</p>
     */
    @Test
    public void when15DollarsThen912dot75RUB() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("15 60.85".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "912.75";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 5} долларов по курсу {@code 1.01}.
     *
     * <p>Ожидаемый результат: {@code 5.05}.</p>
     */
    @Test
    public void when5DollarsThen5dot05EUR() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("5 1.01".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "5.05";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 50} долларов по курсу {@code 0.87}.
     *
     * <p>Ожидаемый результат: {@code 43.50}.</p>
     */
    @Test
    public void when50DollarsThen43dot37GBP() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("50 0.87".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "43.50";
        assertThat(out.toString(), is(expected));
    }
}
