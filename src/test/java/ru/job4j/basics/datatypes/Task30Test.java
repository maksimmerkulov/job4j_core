package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task30}.
 *
 * <p>Проверяется корректность работы метода {@link Task30#difference(int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task30Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task30#difference(int)} для числа {@code 35}.
     *
     * <p>Ожидаемый результат: {@code 2}.</p>
     */
    @Test
    public void when35Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(35);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }


    /**
     * Проверяет метод {@link Task30#difference(int)} для числа {@code 53}.
     *
     * <p>Ожидаемый результат: {@code 2}.</p>
     */
    @Test
    public void when53Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(53);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task30#difference(int)} для числа {@code 10}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when10Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(10);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task30#difference(int)} для числа {@code 11}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when11Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.difference(11);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }
}
