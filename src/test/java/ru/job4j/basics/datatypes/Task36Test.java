package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task36}.
 *
 * <p>Проверяется корректность работы метода {@link Task36#firstLastChange(int)}
 * с различными входными четырехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task36Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task36#firstLastChange(int)}
     * для числа {@code 3642}.
     *
     * <p>Ожидаемый результат: {@code 2643}.</p>
     */
    @Test
    public void when3642Then2643() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3642);
        String expected = "2643" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task36#firstLastChange(int)}
     * для числа {@code 1000}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when1000Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1000);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task36#firstLastChange(int)}
     * для числа {@code 1050}.
     *
     * <p>Ожидаемый результат: {@code 51}.</p>
     */
    @Test
    public void when1050Then51() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1050);
        String expected = "51" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task36#firstLastChange(int)}
     * для числа {@code 1001}.
     *
     * <p>Ожидаемый результат: {@code 1001}.</p>
     */
    @Test
    public void when1001Then1001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(1001);
        String expected = "1001" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task36#firstLastChange(int)}
     * для числа {@code 3609}.
     *
     * <p>Ожидаемый результат: {@code 9603}.</p>
     */
    @Test
    public void when3609Then9603() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.firstLastChange(3609);
        String expected = "9603" + ln;
        assertThat(out.toString(), is(expected));
    }
}
