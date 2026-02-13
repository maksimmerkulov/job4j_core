package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task37}.
 *
 * <p>Проверяется корректность работы метода {@link Task37#leftShift(int)}
 * с различными трехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task37Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task37#leftShift(int)} для числа {@code 123}.
     *
     * <p>Ожидаемый результат: {@code 230}.</p>
     */
    @Test
    public void when123Then230() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(123);
        String expected = "230" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task37#leftShift(int)} для числа {@code 120}.
     *
     * <p>Ожидаемый результат: {@code 200}.</p>
     */
    @Test
    public void when120Then200() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(120);
        String expected = "200" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task37#leftShift(int)} для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when100Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(100);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task37#leftShift(int)} для числа {@code 106}.
     *
     * <p>Ожидаемый результат: {@code 60}.</p>
     */
    @Test
    public void when106Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.leftShift(106);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }
}
