package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task42}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task42#rightCircleShift(int)}
 * с различными четырехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task42Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task42#rightCircleShift(int)}
     * для числа {@code 1234}.
     *
     * <p>Ожидаемый результат: {@code 4123}.</p>
     */
    @Test
    public void when1234Then4123() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1234);
        String expected = "4123" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task42#rightCircleShift(int)}
     * для числа {@code 1200}.
     *
     * <p>Ожидаемый результат: {@code 120}.</p>
     */
    @Test
    public void when1200Then120() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1200);
        String expected = "120" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task42#rightCircleShift(int)}
     * для числа {@code 1000}.
     *
     * <p>Ожидаемый результат: {@code 100}.</p>
     */
    @Test
    public void when1000Then100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1000);
        String expected = "100" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task42#rightCircleShift(int)}
     * для числа {@code 1060}.
     *
     * <p>Ожидаемый результат: {@code 106}.</p>
     */
    @Test
    public void when1060Then106() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1060);
        String expected = "106" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task42#rightCircleShift(int)}
     * для числа {@code 1006}.
     *
     * <p>Ожидаемый результат: {@code 6100}.</p>
     */
    @Test
    public void when1006Then6100() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.rightCircleShift(1006);
        String expected = "6100" + ln;
        assertThat(out.toString(), is(expected));
    }
}
