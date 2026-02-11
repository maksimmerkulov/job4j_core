package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task21}.
 *
 * <p>Проверяется корректность работы метода {@link Task21#separate(int)}
 * для разложения трехзначного числа на цифры сотен, десятков и единиц.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями массива цифр.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет разложение числа {@code 205} на цифры сотен, десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 2 0 5}.</p>
     */
    @Test
    public void when205Then2And0And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(205);
        String expected = "2 0 5" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 361} на цифры сотен, десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 3 6 1}.</p>
     */
    @Test
    public void when361Then3And6And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(361);
        String expected = "3 6 1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 116} на цифры сотен, десятков и единиц.
     *
     * <p>Ожидаемый результат: {@code 1 1 6}.</p>
     */
    @Test
    public void when116Then1And1And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.separate(116);
        String expected = "1 1 6" + ln;
        assertThat(out.toString(), is(expected));
    }
}
