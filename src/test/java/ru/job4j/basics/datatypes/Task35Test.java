package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task35}.
 *
 * <p>Проверяется корректность работы метода {@link Task35#firstLastChange(int)}
 * с различными входными трехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task35Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task35#firstLastChange(int)}
     * для числа {@code 364}.
     *
     * <p>Ожидаемый результат: {@code 463}.</p>
     */
    @Test
    public void when364Then463() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(364);
        String expected = "463" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task35#firstLastChange(int)}
     * для числа {@code 121}.
     *
     * <p>Ожидаемый результат: {@code 121}.</p>
     */
    @Test
    public void when121Then121() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(121);
        String expected = "121" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task35#firstLastChange(int)}
     * для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(100);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task35#firstLastChange(int)}
     * для числа {@code 650}.
     *
     * <p>Ожидаемый результат: {@code 56}.</p>
     */
    @Test
    public void when650Then56() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task35.firstLastChange(650);
        String expected = "56" + ln;
        assertThat(out.toString(), is(expected));
    }
}
