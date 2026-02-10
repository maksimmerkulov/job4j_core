package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task16}.
 *
 * <p>Проверяется корректность работы метода {@link Task16#decreaseBy2(int)}
 * для различных входных значений,
 * с выводом последовательного уменьшения числа на {@code 1} — три раза.</p>
 *
 * <p>Результаты проверяются
 * с помощью перенаправления потока вывода в {@link ByteArrayOutputStream}
 * и сравнения с ожидаемыми строковыми значениями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16Test {

    /**
     * Проверяет метод {@link Task16#decreaseBy2(int)} для числа {@code 6}.
     *
     * <p>Ожидаемый результат: {@code 5, 4, 3}.</p>
     */
    @Test
    public void when6Then5And4And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(6);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("5").add("4").add("3");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task16#decreaseBy2(int)} для числа {@code 0}.
     *
     * <p>Ожидаемый результат: {@code -1, -2, -3}.</p>
     */
    @Test
    public void when0ThenMinus1AndMinus2AndMinus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(0);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-1").add("-2").add("-3");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task16#decreaseBy2(int)} для числа {@code -5}.
     *
     * <p>Ожидаемый результат: {@code -6, -7, -8}.</p>
     */
    @Test
    public void whenMinus5ThenMinus6AndMinus7AndMinus8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(-5);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-6").add("-7").add("-8");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task16#decreaseBy2(int)} для числа {@code 11}.
     *
     * <p>Ожидаемый результат: {@code 10, 9, 8}.</p>
     */
    @Test
    public void when11Then10And9And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.decreaseBy2(11);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("10").add("9").add("8");
        assertThat(out.toString(), is(expected.toString()));
    }
}
