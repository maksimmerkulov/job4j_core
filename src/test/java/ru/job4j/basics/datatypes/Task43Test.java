package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task43}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task43#rightNumChange(int, int)}
 * с различными трехзначными числами.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * <p>Используется {@link ByteArrayOutputStream} для перехвата вывода
 * и {@link StringJoiner} для формирования ожидаемого результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task43Test {

    /**
     * Проверяет метод {@link Task43#rightNumChange(int, int)}
     * для чисел {@code 123} и {@code 456}.
     *
     * <p>Ожидаемый результат: {@code 126} и {@code 453}.</p>
     */
    @Test
    public void when123And456Then126And453() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(123, 456);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("126").add("453");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task43#rightNumChange(int, int)}
     * для чисел {@code 100} и {@code 999}.
     *
     * <p>Ожидаемый результат: {@code 109} и {@code 990}.</p>
     */
    @Test
    public void when100And999Then109And990() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(100, 999);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("109").add("990");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task43#rightNumChange(int, int)}
     * для чисел {@code 555} и {@code 777}.
     *
     * <p>Ожидаемый результат: {@code 557} и {@code 775}.</p>
     */
    @Test
    public void when555And777Then557And775() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task43.rightNumChange(555, 777);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("557").add("775");
        assertThat(out.toString(), is(expected.toString()));
    }
}
