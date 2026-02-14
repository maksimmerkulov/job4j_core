package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task45}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task45#leftNumChange(int, int)}
 * для различных комбинаций чисел с обменом левых цифр.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task45Test {

    /**
     * Проверяет метод {@link Task45#leftNumChange(int, int)}
     * для чисел {@code 123} и {@code 456}.
     *
     * <p>Ожидаемый результат: {@code 423} и {@code 156}.</p>
     */
    @Test
    public void when123And456Then423And156() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(123, 456);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("423").add("156");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task45#leftNumChange(int, int)}
     * для чисел {@code 999} и {@code 555}.
     *
     * <p>Ожидаемый результат: {@code 599} и {@code 955}.</p>
     */
    @Test
    public void when999And555Then599And955() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(999, 555);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("599").add("955");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task45#leftNumChange(int, int)}
     * для чисел {@code 900} и {@code 501}.
     *
     * <p>Ожидаемый результат: {@code 500} и {@code 901}.</p>
     */
    @Test
    public void when900And501Then500And901() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.leftNumChange(900, 501);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("500").add("901");
        assertThat(out.toString(), is(expected.toString()));
    }
}
