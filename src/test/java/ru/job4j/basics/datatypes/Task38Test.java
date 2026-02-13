package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task38}.
 *
 * <p>Проверяется корректность работы метода {@link Task38#leftShift(int)}
 * с различными входными четырехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task38Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task38#leftShift(int)} для числа {@code 1234}.
     *
     * <p>Ожидаемый результат: {@code 2340}.</p>
     */
    @Test
    public void when1234Then2340() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1234);
        String expected = "2340" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task38#leftShift(int)} для числа {@code 1200}.
     *
     * <p>Ожидаемый результат: {@code 2000}.</p>
     */
    @Test
    public void when1200Then2000() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1200);
        String expected = "2000" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task38#leftShift(int)} для числа {@code 1000}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when1000Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1000);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task38#leftShift(int)} для числа {@code 1060}.
     *
     * <p>Ожидаемый результат: {@code 600}.</p>
     */
    @Test
    public void when1060Then600() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1060);
        String expected = "600" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task38#leftShift(int)} для числа {@code 1006}.
     *
     * <p>Ожидаемый результат: {@code 60}.</p>
     */
    @Test
    public void when1006Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1006);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }
}
