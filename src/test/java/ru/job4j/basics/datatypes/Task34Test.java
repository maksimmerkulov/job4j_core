package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task34}.
 *
 * <p>Проверяется корректность работы метода {@link Task34#evenAmount(int)}
 * с различными входными четырехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task34Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task34#evenAmount(int)} для числа {@code 3634}.
     *
     * <p>Ожидаемый результат: {@code 2}.</p>
     */
    @Test
    public void when3634Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(3634);
        String expected = "2" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task34#evenAmount(int)} для числа {@code 2468}.
     *
     * <p>Ожидаемый результат: {@code 4}.</p>
     */
    @Test
    public void when2468Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(2468);
        String expected = "4" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task34#evenAmount(int)} для числа {@code 1357}.
     *
     * <p>Ожидаемый результат: {@code 0}.</p>
     */
    @Test
    public void when1357Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(1357);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task34#evenAmount(int)} для числа {@code 2009}.
     *
     * <p>Ожидаемый результат: {@code 3}.</p>
     */
    @Test
    public void when2009Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(2009);
        String expected = "3" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task34#evenAmount(int)} для числа {@code 3590}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when3590Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.evenAmount(3590);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }
}
