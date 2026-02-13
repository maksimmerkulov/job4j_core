package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task41}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task41#rightCircleShift(int)}
 * с различными трехзначными числами.
 * Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task41Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 123}.
     *
     * <p>Ожидаемый результат: {@code 312}.</p>
     */
    @Test
    public void when123Then312() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(123);
        String expected = "312" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 120}.
     *
     * <p>Ожидаемый результат: {@code 12}.</p>
     */
    @Test
    public void when120Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(120);
        String expected = "12" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 10}.</p>
     */
    @Test
    public void when100Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(100);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 106}.
     *
     * <p>Ожидаемый результат: {@code 610}.</p>
     */
    @Test
    public void when106Then610() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(106);
        String expected = "610" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 111}.
     *
     * <p>Ожидаемый результат: {@code 111}.</p>
     */
    @Test
    public void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(111);
        String expected = "111" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task41#rightCircleShift(int)}
     * для числа {@code 121}.
     *
     * <p>Ожидаемый результат: {@code 112}.</p>
     */
    @Test
    public void when121Then112() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.rightCircleShift(121);
        String expected = "112" + ln;
        assertThat(out.toString(), is(expected));
    }
}
