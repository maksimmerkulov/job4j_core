package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task40}.
 *
 * <p>Проверяется корректность работы метода {@link Task40#leftCircleShift(int)}
 * с различными входными четырехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task40Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task40#leftCircleShift(int)}
     * для числа {@code 1234}.
     *
     * <p>Ожидаемый результат: {@code 2341}.</p>
     */
    @Test
    public void when1234Then2341() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1234);
        String expected = "2341" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task40#leftCircleShift(int)}
     * для числа {@code 1200}.
     *
     * <p>Ожидаемый результат: {@code 2001}.</p>
     */
    @Test
    public void when1200Then2001() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1200);
        String expected = "2001" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task40#leftCircleShift(int)}
     * для числа {@code 1000}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when1000Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1000);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task40#leftCircleShift(int)}
     * для числа {@code 1060}.
     *
     * <p>Ожидаемый результат: {@code 601}.</p>
     */
    @Test
    public void when1060Then601() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1060);
        String expected = "601" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task40#leftCircleShift(int)}
     * для числа {@code 1006}.
     *
     * <p>Ожидаемый результат: {@code 61}.</p>
     */
    @Test
    public void when1006Then61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task40.leftCircleShift(1006);
        String expected = "61" + ln;
        assertThat(out.toString(), is(expected));
    }
}
