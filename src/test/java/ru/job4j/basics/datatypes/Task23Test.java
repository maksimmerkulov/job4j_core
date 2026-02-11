package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task23}.
 *
 * <p>Проверяется корректность работы метода {@link Task23#separate(int)},
 * который разделяет трехзначное число на цифры и выводит их в обратном порядке:
 * единицы, десятки, сотни.</p>
 *
 * <p>Результат работы метода сравнивается с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task23Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет разложение числа {@code 205}.
     *
     * <p>Ожидаемый результат: {@code 5 0 2}.</p>
     */
    @Test
    public void when205Then5And0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(205);
        String expected = "5 0 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 778}.
     *
     * <p>Ожидаемый результат: {@code 8 7 7}.</p>
     */
    @Test
    public void when778Then8And7And7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(778);
        String expected = "8 7 7" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 165}.
     *
     * <p>Ожидаемый результат: {@code 5 6 1}.</p>
     */
    @Test
    public void when165Then5And6And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.separate(165);
        String expected = "5 6 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}
