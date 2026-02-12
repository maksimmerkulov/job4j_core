package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task29}.
 *
 * <p>Проверяется корректность работы метода {@link Task29#numSum(int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task29Test {

    /** Разделитель строк для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task29#numSum(int)} для числа {@code 325}.
     *
     * <p>Ожидаемый результат: {@code 10}.</p>
     */
    @Test
    public void when325Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(325);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task29#numSum(int)} для числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(100);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task29#numSum(int)} для числа {@code 909}.
     *
     * <p>Ожидаемый результат: {@code 18}.</p>
     */
    @Test
    public void when909Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(909);
        String expected = "18" + ln;
        assertThat(out.toString(), is(expected));
    }
}
