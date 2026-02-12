package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task27}.
 *
 * <p>Проверяется корректность работы метода {@link Task27#transform(int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * <p>Тесты используют {@link ByteArrayOutputStream}
 * для перехвата {@link System#out} и проверки результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task27Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task27#transform(int)} для числа {@code 327}.
     *
     * <p>Ожидаемый результат: {@code 703}.</p>
     */
    @Test
    public void when327Then703() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(327);
        String expected = "703" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task27#transform(int)} для числа {@code 560}.
     *
     * <p>Ожидаемый результат: {@code 45}.</p>
     */
    @Test
    public void when560Then45() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(560);
        String expected = "45" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task27#transform(int)} для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code -19}.</p>
     */
    @Test
    public void when100ThenMinus19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.transform(100);
        String expected = "-19" + ln;
        assertThat(out.toString(), is(expected));
    }
}
