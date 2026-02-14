package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task44}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task44#rightNumChange(int, int)}
 * с числами одинаковой и разной длины.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task44Test {

    /**
     * Проверяет метод {@link Task44#rightNumChange(int, int)}
     * для чисел {@code 123} и {@code 4567}.
     *
     * <p>Ожидаемый результат: {@code 127} и {@code 4563}.</p>
     */
    @Test
    public void when123And4567Then127And4563() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(123, 4567);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("127").add("4563");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task44#rightNumChange(int, int)}
     * для чисел {@code 555} и {@code 7777}.
     *
     * <p>Ожидаемый результат: {@code 557} и {@code 7775}.</p>
     */
    @Test
    public void when555And7777Then557And7775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(555, 7777);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("557").add("7775");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task44#rightNumChange(int, int)}
     * для чисел {@code 12345} и {@code 67}.
     *
     * <p>Ожидаемый результат: {@code 12347} и {@code 65}.</p>
     */
    @Test
    public void when12345And67Then12347And65() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.rightNumChange(12345, 67);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("12347").add("65");
        assertThat(out.toString(), is(expected.toString()));
    }
}
