package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task39}.
 *
 * <p>Проверяется корректность работы метода {@link Task39#leftCircleShift(int)}
 * с различными входными трехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task39Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 123}.
     *
     * <p>Ожидаемый результат: {@code 231}.</p>
     */
    @Test
    public void when123Then231() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(123);
        String expected = "231" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 120}.
     *
     * <p>Ожидаемый результат: {@code 201}.</p>
     */
    @Test
    public void when120Then201() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(120);
        String expected = "201" + ln;
        assertThat(out.toString(), is(expected));
    }


    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(100);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 106}.
     *
     * <p>Ожидаемый результат: {@code 61}.</p>
     */
    @Test
    public void when106Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(106);
        String expected = "61" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 111}.
     *
     * <p>Ожидаемый результат: {@code 111}.</p>
     */
    @Test
    public void when111Then111() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(111);
        String expected = "111" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task39#leftCircleShift(int)}
     * для числа {@code 121}.
     *
     * <p>Ожидаемый результат: {@code 211}.</p>
     */
    @Test
    public void when121Then211() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.leftCircleShift(121);
        String expected = "211" + ln;
        assertThat(out.toString(), is(expected));
    }
}
