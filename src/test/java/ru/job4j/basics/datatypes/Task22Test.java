package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task22}.
 *
 * <p>Проверяется корректность работы метода {@link Task22#separate(int)}
 * для разложения двузначного числа на цифры десятков и единиц
 * с последующим выводом в обратном порядке.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет разложение числа {@code 20} на цифры десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 0 2}.</p>
     */
    @Test
    public void when20Then0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(20);
        String expected = "0 2" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 37} на цифры десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 7 3}.</p>
     */
    @Test
    public void when37Then7And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(37);
        String expected = "7 3" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 86} на цифры десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 6 8}.</p>
     */
    @Test
    public void when86Then6And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(86);
        String expected = "6 8" + ln;
        assertThat(out.toString(), is(expected));
    }
}
