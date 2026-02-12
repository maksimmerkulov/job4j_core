package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task28}.
 *
 * <p>Проверяется корректность работы метода {@link Task28#numSum(int)}
 * для различных двузначных положительных чисел.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task28Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task28#numSum(int)} для числа {@code 32}.
     *
     * <p>Ожидаемый результат: {@code 5}.</p>
     */
    @Test
    public void when32Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(32);
        String expected = "5" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task28#numSum(int)} для числа {@code 10}.
     *
     * <p>Ожидаемый результат: {@code 1}.</p>
     */
    @Test
    public void when10Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(10);
        String expected = "1" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task28#numSum(int)} для числа {@code 66}.
     *
     * <p>Ожидаемый результат: {@code 12}.</p>
     */
    @Test
    public void when66Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task28.numSum(66);
        String expected = "12" + ln;
        assertThat(out.toString(), is(expected));
    }
}
