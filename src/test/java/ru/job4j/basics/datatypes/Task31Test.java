package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task31}.
 *
 * <p>Проверяется корректность работы метода {@link Task31#difference(int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task31Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 352}.
     *
     * <p>Ожидаемый результат: {@code 5}.</p>
     */
    @Test
    public void when352Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(352);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 309}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when309Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(309);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 190}.
     *
     * <p>Ожидаемый результат: {@code 9}.</p>
     */
    @Test
    public void when190Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(190);
        String expected = "9" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 363}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when363Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(363);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 101}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when101Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(101);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task31#difference(int)} для числа {@code 226}.
     *
     * <p>Ожидаемый результат: {@code 8}.</p>
     */
    @Test
    public void when226Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task31.difference(226);
        String expected = "8" + ln;
        assertThat(out.toString(), is(expected));
    }
}
