package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task20}.
 *
 * <p>Проверяется корректность работы метода {@link Task20#separate(int)}
 * для различных двузначных чисел. Метод должен корректно выводить
 * количество десятков и единиц числа через пробел на консоль.</p>
 *
 * <p>Результаты проверяются с помощью перенаправления потока вывода
 * в {@link ByteArrayOutputStream}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20Test {

    /** Символ переноса строки. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет работу метода {@link Task20#separate(int)}
     * для числа {@code 20}.
     *
     * <p>Ожидаемый результат: {@code 2 0}.</p>
     */
    @Test
    public void when20Then2And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(20);
        String expected = "2 0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет работу метода {@link Task20#separate(int)}
     * для числа {@code 36}.
     *
     * <p>Ожидаемый результат: {@code 3 6}.</p>
     */
    @Test
    public void when36Then3And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(36);
        String expected = "3 6" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет работу метода {@link Task20#separate(int)}
     * для числа {@code 11}.
     *
     * <p>Ожидаемый результат: {@code 1 1}.</p>
     */
    @Test
    public void when11Then1And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.separate(11);
        String expected = "1 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}
